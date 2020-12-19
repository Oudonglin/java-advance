package com.doney.advanced.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.*;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bean1 implements InitializingBean, DisposableBean, Lifecycle,ApplicationListener<ApplicationStartedEvent>, ApplicationContextAware {
    public String name = "bean1";

    @PostConstruct
    public void PostConstruct(){
        System.out.println("PostConstruct");
    }
    @PreDestroy
    public void PreDestroy(){
        System.out.println("PreDestroy");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }

    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public boolean isRunning() {
        System.out.println("isRunning");
        return false;
    }

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        ConfigurableApplicationContext applicationContext = event.getApplicationContext();
        System.out.println("onApplicationEvent");
        System.out.println("springboot 加载完毕");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext");
    }
}
