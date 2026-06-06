package org.indivaragroup.jdt17.spring.dasar.configuration;

import org.indivaragroup.jdt17.spring.dasar.server.BeanServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleAnnotationConfiguration {

    @Bean(initMethod = "start", destroyMethod = "stop")
    public BeanServer server() {
        return new BeanServer();
    }

}
