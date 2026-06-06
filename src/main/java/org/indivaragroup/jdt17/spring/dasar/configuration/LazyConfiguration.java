package org.indivaragroup.jdt17.spring.dasar.configuration;

import org.indivaragroup.jdt17.spring.dasar.dto.HelloDTO;
import org.indivaragroup.jdt17.spring.dasar.dto.WorldDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class LazyConfiguration {

    @Lazy
    @Bean
    public HelloDTO hello() {
        System.out.println("hello dibuat");
        return new HelloDTO();
    }

    @Bean
    public WorldDTO world(){
        System.out.println("world dibuat");
        return new WorldDTO();
    }
}
