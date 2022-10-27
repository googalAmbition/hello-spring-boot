package com.tcoding.demo.quartz.job;

import com.tcoding.demo.quartz.model.Message;
import com.tcoding.demo.quartz.repository.MessageRepository;
import lombok.extern.slf4j.Slf4j;
import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;
import org.quartz.SchedulerException;
import org.quartz.TriggerKey;
import org.springframework.stereotype.Component;

import java.util.Optional;
import javax.annotation.Resource;

/**
 * @author 陈天成
 * @date 2022/10/26.
 */
@Slf4j
@Component
public class MessageJob implements Job {

    @Resource
    private MessageRepository messageRepository;


    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {

        /* Get message id recorded by scheduler during scheduling */
        JobDataMap dataMap = context.getJobDetail().getJobDataMap();

        String messageId = dataMap.getString("messageId");

        log.info("Executing job for message id {}", messageId);

        /* Get message from database by id */
        int id = Integer.parseInt(messageId);
        Optional<Message> messageOpt = messageRepository.findById(id);

        /* update message visible in database */
        Message message = messageOpt.get();
        message.setVisible(true);
        messageRepository.save(message);

        /* unschedule or delete after job gets executed */

        try {
            context.getScheduler().deleteJob(new JobKey(messageId));

            TriggerKey triggerKey = new TriggerKey(messageId);

            context.getScheduler().unscheduleJob(triggerKey);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}

