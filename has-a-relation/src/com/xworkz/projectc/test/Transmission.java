package com.xworkz.projectc.test;

public class Transmission {

    private String type;
    private int gears;
    private boolean isAutomatic;

    public Transmission(String type, int gears, boolean isAutomatic) {
        this.type = type;
        this.gears = gears;
        this.isAutomatic = isAutomatic;
    }

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }
}
