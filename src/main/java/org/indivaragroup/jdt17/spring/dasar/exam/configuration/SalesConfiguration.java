package org.indivaragroup.jdt17.spring.dasar.exam.configuration;

import org.indivaragroup.jdt17.spring.dasar.exam.service.CarSalesService;
import org.indivaragroup.jdt17.spring.dasar.exam.service.MotorSalesService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SalesConfiguration {

    @Bean("motor1")
    public MotorSalesService sales1(){
        return new MotorSalesService("Andi", "Zona A");
    }


    @Bean("motor2")
    public MotorSalesService sales2(){
        return new MotorSalesService("Budi", "Zona B");
    }


    @Bean("motor3")
    public MotorSalesService sales3(){
        return new MotorSalesService("Cici", "Zona C");
    }


    @Bean("mobil1")
    public CarSalesService sales4(){
        return new CarSalesService("Dedi", "Zona D");
    }


    @Bean("mobil2")
    public CarSalesService sales5(){
        return new CarSalesService("Eka", "Zona E");
    }

}
