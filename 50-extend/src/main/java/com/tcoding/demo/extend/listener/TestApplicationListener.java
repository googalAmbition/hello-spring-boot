package com.tcoding.demo.extend.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.RequestHandledEvent;

/**
 * @author 陈天成
 * @date 2022/10/20.
 */
public class TestApplicationListener {

    @Component
    public static class Refresh implements ApplicationListener<ContextRefreshedEvent> {

        @Override
        public void onApplicationEvent(ContextRefreshedEvent event) {
            String method = Thread.currentThread().getStackTrace()[1].getMethodName();
            String clazz = this.getClass().getSimpleName();
            System.err.println(clazz + "->" + method);
        }
    }

    @Component
    public static class Started implements ApplicationListener<ApplicationStartedEvent> {

        @Override
        public void onApplicationEvent(ApplicationStartedEvent event) {
            String method = Thread.currentThread().getStackTrace()[1].getMethodName();
            String clazz = this.getClass().getSimpleName();
            System.err.println(clazz + "->" + method);
        }
    }

    @Component
    public static class Stop implements ApplicationListener<ContextStoppedEvent> {

        @Override
        public void onApplicationEvent(ContextStoppedEvent event) {
            String method = Thread.currentThread().getStackTrace()[1].getMethodName();
            String clazz = this.getClass().getSimpleName();
            System.err.println(clazz + "->" + method);
        }
    }

    @Component
    public static class Close implements ApplicationListener<ContextClosedEvent> {

        @Override
        public void onApplicationEvent(ContextClosedEvent event) {
            String method = Thread.currentThread().getStackTrace()[1].getMethodName();
            String clazz = this.getClass().getSimpleName();
            System.err.println(clazz + "->" + method);
        }
    }

    @Component
    public static class RequestHandle implements ApplicationListener<RequestHandledEvent> {

        @Override
        public void onApplicationEvent(RequestHandledEvent event) {
            String method = Thread.currentThread().getStackTrace()[1].getMethodName();
            String clazz = this.getClass().getSimpleName();
            System.err.println(clazz + "->" + method);
        }
    }
}


