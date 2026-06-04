package org.indivaragroup.jdt17.spring.dasar.exam.configuration;

import org.indivaragroup.jdt17.spring.dasar.exam.model.Storage;
import org.indivaragroup.jdt17.spring.dasar.exam.service.DistibutionService;
import org.indivaragroup.jdt17.spring.dasar.exam.service.Sales;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DistributionConfiguration {

    @Bean
    public DistibutionService distibutionService(
            Storage storage,
            @Qualifier("motor1") Sales MotoSalesOne,
            @Qualifier("motor2") Sales MotoSalesTwo,
            @Qualifier("motor3") Sales MotoSalesThree,
            @Qualifier("mobil1") Sales CarSalesOne,
            @Qualifier("mobil2") Sales CarSalesTwo
    ) {
        return new DistibutionService(storage, MotoSalesOne, MotoSalesTwo, MotoSalesThree, CarSalesOne, CarSalesTwo);
    }

}
