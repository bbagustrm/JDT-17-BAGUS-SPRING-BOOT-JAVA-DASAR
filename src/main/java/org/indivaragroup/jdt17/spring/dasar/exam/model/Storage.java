package org.indivaragroup.jdt17.spring.dasar.exam.model;

public class Storage {
    private String nameStorage;
    private Integer stockStorage;

    public Storage(String nameStorage, Integer stockStorage) {
        this.nameStorage = nameStorage;
        this.stockStorage = stockStorage;
    }

    public void reduceStock(Integer itemStock){
        this.stockStorage -= itemStock;
    }

    public String getNameStorage() {
        return nameStorage;
    }

    public void setNameStorage(String nameStorage) {
        this.nameStorage = nameStorage;
    }

    public Integer getStockStorage() {
        return stockStorage;
    }

    public void setStockStorage(Integer stockStorage) {
        this.stockStorage = stockStorage;
    }
}
