package com.tcoding.demo.quartz.controller;

import com.tcoding.demo.quartz.config.QuartzConfig;
import com.tcoding.demo.quartz.dto.MessageDto;
import com.tcoding.demo.quartz.job.MessageJob;
import com.tcoding.demo.quartz.model.Message;
import com.tcoding.demo.quartz.repository.MessageRepository;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.SimpleTrigger;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Date;
import java.util.Optional;
import javax.annotation.Resource;

/**
 * @author 陈天成
 * @date 2022/10/26.
 */
@RestController
@RequestMapping("/messages")
public class MessageSchedulingController {

    @Resource
    private QuartzConfig quartzConfig;
    @Resource
    private MessageRepository messageRepository;
    @Resource
    private Scheduler scheduler;

    @PostMapping(path = "/schedule-visibility")
    public MessageDto scheduleMessageVisibility(@RequestBody MessageDto messageDto) {
        try {
            // save messages in table
            Message message = new Message();
            message.setContent(messageDto.getContent());
            message.setVisible(false);
            messageDto.setMakeVisibleAt(System.currentTimeMillis() + 10 * 1000);
            message.setMakeVisibleAt(messageDto.getMakeVisibleAt());

            message = messageRepository.save(message);

            // Creating JobDetail instance
            String id = String.valueOf(message.getId());
            JobDetail jobDetail = JobBuilder.newJob(MessageJob.class).withIdentity(id).build();

            // Adding JobDataMap to jobDetail
            jobDetail.getJobDataMap().put("messageId", id);

            // Scheduling time to run job
            Date triggerJobAt = new Date(message.getMakeVisibleAt());

            SimpleTrigger trigger = TriggerBuilder.newTrigger().withIdentity(id)
                .startAt(triggerJobAt).withSchedule(SimpleScheduleBuilder.simpleSchedule()
                    .withMisfireHandlingInstructionFireNow())
                .build();
            // Getting scheduler instance
            // Scheduler scheduler = quartzConfig.schedulerFactoryBean().getScheduler();

            scheduler.scheduleJob(jobDetail, trigger);
            scheduler.start();

            messageDto.setStatus("SUCCESS");
        } catch (SchedulerException e) {
            // scheduling failed
            messageDto.setStatus("FAILED");
            e.printStackTrace();
        }
        return messageDto;
    }

    @DeleteMapping(path = "/{messageId}/unschedule-visibility")
    public MessageDto unscheduleMessageVisibility(
        @PathVariable(name = "messageId") Integer messageId) {

        MessageDto messageDto = new MessageDto();

        Optional<Message> messageOpt = messageRepository.findById(messageId);
        if (!messageOpt.isPresent()) {
            messageDto.setStatus("Message Not Found");
            return messageDto;
        }

        Message message = messageOpt.get();
        message.setVisible(false);
        messageRepository.save(message);

        String id = String.valueOf(message.getId());

        try {
            Scheduler scheduler = quartzConfig.schedulerFactoryBean().getScheduler();

            scheduler.deleteJob(new JobKey(id));
            TriggerKey triggerKey = new TriggerKey(id);
            scheduler.unscheduleJob(triggerKey);
            messageDto.setStatus("SUCCESS");
        } catch (IOException | SchedulerException e) {
            messageDto.setStatus("FAILED");
            e.printStackTrace();
        }
        return messageDto;
    }
}

