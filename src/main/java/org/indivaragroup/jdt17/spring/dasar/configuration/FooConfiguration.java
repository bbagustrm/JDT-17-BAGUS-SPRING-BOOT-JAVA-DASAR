package org.indivaragroup.jdt17.spring.dasar.configuration;

import org.indivaragroup.jdt17.spring.dasar.dto.HelloDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FooConfiguration {

    @Bean
    public HelloDTO hello() {
        return new HelloDTO();
    }
}
