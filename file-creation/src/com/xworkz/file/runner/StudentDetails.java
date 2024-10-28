package com.xworkz.file.runner;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;


import com.xworkz.file.dto.StudentDto;



public class StudentDetails {

	public static void main(String[] args) {
		StudentDto dto = new StudentDto("Ganesh", 307);
		File file = new File("StudentDetails.txt");
		try {
			if (!file.exists()) {
				if (file.createNewFile()) {
					System.out.println("File iscreated");
					write(dto, file);
				} else {
					System.out.println("File iscreated");
					write(dto, file);
				}
			}

		} catch (IOException e) {
			System.out.println("File not created");

		}
		Object obj = read(file);
		System.out.println(obj);
	}

	public static void write(StudentDto dto, File file) {
		try (OutputStream out = new FileOutputStream(file); ObjectOutputStream in = new ObjectOutputStream(out)) {
			in.writeObject(dto);
			System.out.println("File length"+file.length());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static Object read(File file) {
		try (FileInputStream filein = new FileInputStream(file); ObjectInputStream in = new ObjectInputStream(filein)) {
			return in.readObject();
		} catch (ClassNotFoundException | IOException e) {
			System.out.println(e.getMessage());
			return new Object();
		}
	}

}
