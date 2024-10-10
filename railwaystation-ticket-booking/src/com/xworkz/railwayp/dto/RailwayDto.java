package com.xworkz.railwayp.dto;

import com.xworkz.railwayp.enums.Locationconstant;

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
public class RailwayDto {
 private String stationName;
 private int trainNumber;
 private String platformNumber;
 private Locationconstant locations;
 private PersondetailsDto persondetails;

}
