package org.indivaragroup.jdt17.spring.dasar.configuration;

import org.indivaragroup.jdt17.spring.dasar.bean.PaymentGatewayClientFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanConfiguration {

    @Bean
    public PaymentGatewayClientFactoryBean paymentGatewayClient() {
        return new PaymentGatewayClientFactoryBean();
    }
}
