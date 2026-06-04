package org.indivaragroup.jdt17.spring.dasar.configuration;

import org.indivaragroup.jdt17.spring.dasar.dto.HelloDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DuplicateBeanConfiguration {

    @Bean
    public HelloDTO hello1(){
        return new HelloDTO();
    }

    @Bean
    public HelloDTO hello2(){
        return new HelloDTO();
    }
}
