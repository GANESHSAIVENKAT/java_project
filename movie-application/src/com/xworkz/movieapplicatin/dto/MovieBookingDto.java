package com.xworkz.movieapplicatin.dto;

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
public class MovieBookingDto {
	private String username;
	private String password;
	private String email;
	private String phone;
}
