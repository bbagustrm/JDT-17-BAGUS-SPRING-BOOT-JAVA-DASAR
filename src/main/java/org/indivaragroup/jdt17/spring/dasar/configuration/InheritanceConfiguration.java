package org.indivaragroup.jdt17.spring.dasar.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.indivaragroup.jdt17.spring.dasar")
public class InheritanceConfiguration {
    // MerchantServiceImpl akan terdeteksi otomatis
}
