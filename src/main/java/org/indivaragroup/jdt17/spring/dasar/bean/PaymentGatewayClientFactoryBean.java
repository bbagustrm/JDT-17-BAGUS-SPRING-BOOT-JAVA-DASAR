package org.indivaragroup.jdt17.spring.dasar.bean;

import org.indivaragroup.jdt17.spring.dasar.dto.PaymentGatewayClient;
import org.springframework.beans.factory.FactoryBean;

public class PaymentGatewayClientFactoryBean
        implements FactoryBean {

    @Override
    public PaymentGatewayClient getObject() throws Exception {
        return new PaymentGatewayClient("api-key", "secret-key");
    }

    @Override
    public Class getObjectType() {
        return PaymentGatewayClient.class;
    }
}
