package com.xworkz.exceptions.testRunner;

import java.util.Scanner;

public class StudentDetailsRunner {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the student name:");
            String studentName = scanner.nextLine();  

            System.out.println("Enter the student ID:");
            int studentId = scanner.nextInt();  

            scanner.nextLine();  

            System.out.println("Enter the college name:");
            String collegeName = scanner.nextLine();  
            
            System.out.println("Student Name: " + studentName);
            System.out.println("Student ID: " + studentId);
            System.out.println("College Name: " + collegeName);
        }
    }
}
