package org.indivaragroup.jdt17.spring.dasar.configuration;

import org.indivaragroup.jdt17.spring.dasar.dto.HelloDTO;
import org.indivaragroup.jdt17.spring.dasar.dto.WorldDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class DependsOnConfiguration {
    @Bean
    @DependsOn(value = {"bar"})
    public HelloDTO foo(){
        System.out.println("ini FOO");
        return new HelloDTO();
    }

    @Bean
    public WorldDTO bar(){
        System.out.println("ini BAR");

        return new WorldDTO();
    }


}
