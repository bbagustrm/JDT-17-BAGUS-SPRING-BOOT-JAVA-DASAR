package org.indivaragroup.jdt17.spring.dasar.service.impl;

import org.indivaragroup.jdt17.spring.dasar.service.MerchantService;
import org.springframework.stereotype.Component;

@Component
public class MerchantServiceImpl implements MerchantService {

    @Override
    public String getName() {
        return "Merchant Service";
    }
}
