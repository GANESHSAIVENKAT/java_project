package com.xworkz.projectc.test;

public class Engine {

    private String type;
    private int horsepower;
    private boolean isElectric;

    public Engine(String type, int horsepower, boolean isElectric) {
        this.type = type;
        this.horsepower = horsepower;
        this.isElectric = isElectric;
    }

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}
