package org.indivaragroup.jdt17.spring.dasar.exam.configuration;

import org.indivaragroup.jdt17.spring.dasar.exam.model.Storage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StorageConfiguration {

    @Bean
    public Storage storage() {
        return new Storage("Core Storage", 1000);
    }

}
