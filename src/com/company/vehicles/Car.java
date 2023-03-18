package com.company.vehicles;

import com.company.detailes.Engine;
import com.company.professions.Driver;

public class Car {
    private String brand;

    private String clas ;

    private String massa;

    private Driver driver;

    private Engine engine;

    public Car(String brand, String clas, String massa, Driver driver, Engine engine) {
        this.brand = brand;
        this.clas = clas;
        this.massa = massa;
        this.driver = driver;
        this.engine = engine;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String start(){
        return "START";
    }

    public String stop(){
        return "STOP";
    }

    public String turnRight(){
        return "TURN RIGHT";
    }

    public String turnLeft(){
        return "TURN LEFT";
    }

    @Override
    public String toString() {
        return "brand - " + brand  +
                ", clas - " + clas  +
                ", massa - " + massa  + engine +
        "\n"+         driver  ;


    }
}

















