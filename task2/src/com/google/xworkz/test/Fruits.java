package com.google.xworkz.test;

public class Fruits {

    private String[] data;
    private int size=0;

    public Fruits(int capacity) {
        data = new String[capacity];
     
    }

    public void create(String value) {
        if (size == data.length) {
            System.out.println("Array is full. Cannot add more elements.");
            return;
        }
        if (contains(value)) {
            System.out.println("Value '" + value + "' already exists. Cannot add duplicate.");
            
        }
        data[size++] = value;
        System.out.println("Value '" + value + "' added successfully.");
    }

    // Read - Display all values in the array
    public void read() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        System.out.println("Current values in the array:");
        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }
    }

    // Update - Modify an existing value in the array
    public void update(String oldValue, String newValue) {
        int index = findIndex(oldValue);
        if (index == -1) {
            System.out.println("Value '" + oldValue + "' not found in the array.");
            return;
        }
        if (contains(newValue)) {
            System.out.println("Value '" + newValue + "' already exists. Cannot update to duplicate.");
            return;
        }
        data[index] = newValue;
        System.out.println("Value '" + oldValue + "' updated to '" + newValue + "'.");
    }

    // Delete - Remove a value from the array
    public void delete(String value) {
        int index = findIndex(value);
        if (index == -1) {
            System.out.println("Value '" + value + "' not found in the array.");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;  // Clear the last element
        size--;
        System.out.println("Value '" + value + "' removed successfully.");
    }

    // Helper method to check if the array contains a value
    private boolean contains(String value) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    // Helper method to find the index of a value
    private int findIndex(String value) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }


}
