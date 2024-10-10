package com.google.xworkz.testrunner;

import com.google.xworkz.test.Fruits;

public class FruitsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Fruits crud = new Fruits(10);  // Initialize with a capacity of 10

        // Create values
        crud.create("apple");
        crud.create("banana");
        crud.create("apple");  // Duplicate, should not be added

        // Read values
        crud.read();

        // Update values
        crud.update("banana", "cherry");
        crud.update("banana", "cherry");  // Attempt to update to existing value

        // Delete values
        crud.delete("apple");
        crud.delete("apple");  // Attempt to delete a value that no longer exists

        // Read values after updates and deletions
        crud.read();
	}

}
