package org.indivaragroup.jdt17.spring.dasar.configuration;

import org.indivaragroup.jdt17.spring.dasar.dto.HelloDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OptionalConfiguration {

    @Bean
    public HelloDTO hello() {
        return new HelloDTO();
    }

    // tidak ada world bean yang didaftarkan
}
