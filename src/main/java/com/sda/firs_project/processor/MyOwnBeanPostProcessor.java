package com.sda.firs_project.processor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyOwnBeanPostProcessor implements BeanPostProcessor {

    private static final Log LOGGER = LogFactory.getLog(MyOwnBeanPostProcessor.class);

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        LOGGER.info("Before Initialization");
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        LOGGER.info("After Initialization");
        return bean;
    }

}
