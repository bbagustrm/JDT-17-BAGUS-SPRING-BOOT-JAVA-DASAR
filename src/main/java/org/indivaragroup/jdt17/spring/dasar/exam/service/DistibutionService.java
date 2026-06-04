package org.indivaragroup.jdt17.spring.dasar.exam.service;

import org.indivaragroup.jdt17.spring.dasar.exam.model.Storage;
import org.springframework.beans.factory.annotation.Qualifier;

public class DistibutionService {

    private final Storage storage;
    private final Sales motoSalesOne;
    private final Sales motoSalesTwo;
    private final Sales motoSalesThree;
    private final Sales carSalesOne;
    private final Sales carSalesTwo;

    public DistibutionService(
            Storage storage,
            @Qualifier("motor1") Sales motoSalesOne,
            @Qualifier("motor2") Sales motoSalesTwo,
            @Qualifier("motor3") Sales motoSalesThree,
            @Qualifier("mobil1") Sales carSalesOne,
            @Qualifier("mobil2") Sales carSalesTwo
    ) {
        this.storage = storage;
        this.motoSalesOne = motoSalesOne;
        this.motoSalesTwo = motoSalesTwo;
        this.motoSalesThree = motoSalesThree;
        this.carSalesOne = carSalesOne;
        this.carSalesTwo = carSalesTwo;
    }


    public void printDistribution() {
        printSales(motoSalesOne);
        printSales(motoSalesTwo);
        printSales(motoSalesThree);
        printSales(carSalesOne);
        printSales(carSalesTwo);
        System.out.println("Jumlah stock di " + storage.getNameStorage() + " = " + storage.getStockStorage());
    }

    private void printSales(Sales sales) {
        storage.reduceStock(50);
        System.out.println(
                "[DISTRIBUSI]" + "Sales : " + sales.getName() + "Zone : " + sales.getZone() + "Type Vechile : " + sales.getTypeVehicle() + "Storage : " + storage.getNameStorage() + "(" + storage.getStockStorage() + ")");
    }



}
