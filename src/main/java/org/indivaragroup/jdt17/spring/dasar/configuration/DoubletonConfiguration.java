package org.indivaragroup.jdt17.spring.dasar.configuration;

import org.indivaragroup.jdt17.spring.dasar.dto.WorldDTO;
import org.indivaragroup.jdt17.spring.dasar.scope.DoubletonScope;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class DoubletonConfiguration {

    @Bean
    public CustomScopeConfigurer customScopeConfigurer() {
        var configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubletonScope());
        return configurer;
    }

    @Bean
    @Scope("doubleton")
    public WorldDTO worldDoubleton() {
        return new WorldDTO();
    }
}
