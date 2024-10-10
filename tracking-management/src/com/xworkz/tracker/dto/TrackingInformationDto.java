package com.xworkz.tracker.dto;

import java.time.LocalDateTime;

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
public class TrackingInformationDto {

	private int trackerId;
	private String packageName;
	private String fromlocation;
	private String tolocation;
	private LocalDateTime pakagedate;
	private LocalDateTime deleverydate;
}
