package org.indivaragroup.jdt17.spring.dasar.configuration;

import org.indivaragroup.jdt17.spring.dasar.dto.HelloDTO;
import org.indivaragroup.jdt17.spring.dasar.dto.HelloWorld;
import org.indivaragroup.jdt17.spring.dasar.dto.WorldDTO;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.Bean;

public class ObjectProviderConfiguration {
    // Tidak ada bean Foo yang didaftarkan
    @Bean
    public WorldDTO bar() {
        return new WorldDTO();
    }

    @Bean
    public HelloWorld helloWorld(ObjectProvider<HelloDTO> helloProvider) {
        return new HelloWorld((HelloDTO) helloProvider);
    }

}
