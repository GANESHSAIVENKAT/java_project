package com.xworkz.test.runner;

import java.util.Scanner;

import com.xworkz.test.dto.CricketersListDto;
import com.xworkz.test.service.CricketersdetailsService;
import com.xworkz.test.service.CricketersdetailsServiceImplimentation;

public class CricketersDetailsRunner {

	public static void main(String[] args) {
		CricketersListDto cricketers=new CricketersListDto();
		cricketers.setName("Virat");
		cricketers.setJnumber(18);
		cricketers.setAge(54);
		cricketers.setRunrate(45);
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter array size");
		int arraySize=scanner.nextInt();
		
		CricketersdetailsService info=new CricketersdetailsServiceImplimentation();
		info.setArraySize(arraySize);
		String output=info.onSaveData(cricketers);
		String output1=info.onSaveData(cricketers);
		System.err.println(output);
		System.err.println(output1);
		info.read();
		
		System.out.println("Update");
		String updatedoutput=info.onUpdate(cricketers, 7);
		System.out.println(updatedoutput);
		info.read();
		
		System.out.println("delete");
		String deletedoutput=info.deleteData(7);
		System.out.println(deletedoutput);
		info.read();
	}
}
