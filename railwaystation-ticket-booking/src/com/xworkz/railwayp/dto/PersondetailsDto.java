package com.xworkz.railwayp.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PersondetailsDto {

	private String name;
	private int age;
	private long phoneNumber;
	private int totalAmount;
	private long adhaarNumber;
	
}
