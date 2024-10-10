package com.xworkz.projectc.test;

public class Wheel {

    private String material;
    private int size;
    private boolean isAlloy;

    public Wheel(String material, int size, boolean isAlloy) {
        this.material = material;
        this.size = size;
        this.isAlloy = isAlloy;
    }

    // Getters and Setters
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isAlloy() {
        return isAlloy;
    }

    public void setAlloy(boolean alloy) {
        isAlloy = alloy;
    }
}
