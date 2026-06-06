package org.indivaragroup.jdt17.spring.dasar.service.impl;

import org.indivaragroup.jdt17.spring.dasar.dto.HelloDTO;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class MyComponentImpl implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext ctx)
            throws BeansException {
        this.applicationContext = ctx;
    }

    public void doSomething() {
        HelloDTO hello = applicationContext.getBean(HelloDTO.class);
        System.out.println(hello + "adad");
    }
}
