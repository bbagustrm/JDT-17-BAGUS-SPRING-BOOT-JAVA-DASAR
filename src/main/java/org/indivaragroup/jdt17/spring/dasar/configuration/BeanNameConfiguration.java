package org.indivaragroup.jdt17.spring.dasar.configuration;

import org.indivaragroup.jdt17.spring.dasar.dto.HelloDTO;
import org.indivaragroup.jdt17.spring.dasar.dto.WorldDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanNameConfiguration {

    @Bean(name = "helloSatuBean")
    public HelloDTO hello1(){
        return new HelloDTO();
    }

    @Bean(name = "helloDuaBean")
    public HelloDTO world2(){
        return new HelloDTO();
    }
}
