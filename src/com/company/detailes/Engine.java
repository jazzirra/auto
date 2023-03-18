package com.company.detailes;

public class Engine {
    private String power;
    private String production;

    public Engine(String power, String production) {
        this.power = power;
        this.production = production;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return " , power - " + power  +
                ", production - " + production ;
    }
}
