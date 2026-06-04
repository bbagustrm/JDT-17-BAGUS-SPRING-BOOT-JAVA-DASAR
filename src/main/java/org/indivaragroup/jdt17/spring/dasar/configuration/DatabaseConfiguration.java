package org.indivaragroup.jdt17.spring.dasar.configuration;

import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfiguration {
    private static DatabaseConfiguration databaseConfiguration;

    public static DatabaseConfiguration getInstance() {
        if(databaseConfiguration == null) {
            databaseConfiguration = new DatabaseConfiguration();
        }
        return databaseConfiguration;
    }
}
