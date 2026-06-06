package org.indivaragroup.jdt17.spring.dasar.server;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class BeanServer1 {

    @PostConstruct
    public void start() {
        System.out.println("Server: start - server dimulai");
    }

    @PreDestroy
    public void stop() {
        System.out.println("Server: stop - server dihentikan");
    }
}