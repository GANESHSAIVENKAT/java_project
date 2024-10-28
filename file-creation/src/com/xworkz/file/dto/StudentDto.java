package com.xworkz.file.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class StudentDto implements Serializable{

	 String studentName;
	 int id;
	 
}
