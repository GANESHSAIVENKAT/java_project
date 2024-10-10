package com.xworkz.test.dto;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@EqualsAndHashCode
public class CricketersListDto {

	private String name;
	private int jnumber;
	private int age;
	private String teamname;
	private int runrate;
	
	
}
