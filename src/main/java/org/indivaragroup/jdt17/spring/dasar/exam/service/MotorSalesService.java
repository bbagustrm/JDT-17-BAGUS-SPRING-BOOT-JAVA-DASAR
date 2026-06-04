package org.indivaragroup.jdt17.spring.dasar.exam.service;

public class MotorSalesService implements Sales {
    private String nameSales;
    private String zoneSales;
    private final String typeVehicle = "Motor";

    public MotorSalesService(String nameSales, String zoneSales) {
        this.nameSales = nameSales;
        this.zoneSales = zoneSales;
    }

    @Override
    public String getName() {
        return nameSales;
    }

    @Override
    public String getZone() {
        return zoneSales;
    }

    @Override
    public String getTypeVehicle() {
        return typeVehicle;
    }

}
