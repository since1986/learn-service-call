package com.github.since1986.learn.cloud.service.b;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class EchoServiceImpl implements EchoService, ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public Echo get(long id, boolean showTimestamp) {
        return Echo
                .newBuilder()
                .withId(id)
                .withContent("当前Profile为：" + applicationContext.getEnvironment().getActiveProfiles()[0])
                .withTimestamp(showTimestamp ? System.currentTimeMillis() : -1L)
                .build();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
