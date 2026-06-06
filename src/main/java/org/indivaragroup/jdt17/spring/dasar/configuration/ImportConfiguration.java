package org.indivaragroup.jdt17.spring.dasar.configuration;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class
})
public class ImportConfiguration {

}
