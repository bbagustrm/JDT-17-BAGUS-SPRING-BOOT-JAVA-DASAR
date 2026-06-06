package org.indivaragroup.jdt17.spring.dasar.dto;

public class PaymentGatewayClient {
    private final String apiKey;
    private final String secretKey;

    public PaymentGatewayClient(String apiKey, String secretKey) {
        this.apiKey = apiKey;
        this.secretKey = secretKey;
    }

}
