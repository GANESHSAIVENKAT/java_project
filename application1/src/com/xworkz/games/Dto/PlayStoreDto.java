package com.xworkz.games.Dto;

import java.time.LocalDate;

public class PlayStoreDto {

	private String applicationsName;
	private String applicationsize;
	private String applicationType;
	private LocalDate createddate;
	
	public PlayStoreDto() {
		
	}
	public PlayStoreDto(String applicationName, String applicationsize, String applicationType, LocalDate createddate) {
		super();
		this.applicationsName = applicationName;
		this.applicationsize = applicationsize;
		this.applicationType = applicationType;
		this.createddate = createddate;
	}
	public String getApplicationName() {
		return applicationsName;
	}
	public void setApplicationName(String applicationName) {
		this.applicationsName = applicationName;
	}
	public String getApplicationsize() {
		return applicationsize;
	}
	public void setApplicationsize(String applicationsize) {
		this.applicationsize = applicationsize;
	}
	public String getApplicationType() {
		return applicationType;
	}
	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}
	public LocalDate getCreateddate() {
		return createddate;
	}
	public void setCreateddate(LocalDate createddate) {
		this.createddate = createddate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((applicationsName == null) ? 0 : applicationsName.hashCode());
		result = prime * result + ((applicationType == null) ? 0 : applicationType.hashCode());
		result = prime * result + ((applicationsize == null) ? 0 : applicationsize.hashCode());
		result = prime * result + ((createddate == null) ? 0 : createddate.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayStoreDto other = (PlayStoreDto) obj;
		if (applicationsName == null) {
			if (other.applicationsName != null)
				return false;
		} else if (!applicationsName.equals(other.applicationsName))
			return false;
		if (applicationType == null) {
			if (other.applicationType != null)
				return false;
		} else if (!applicationType.equals(other.applicationType))
			return false;
		if (applicationsize == null) {
			if (other.applicationsize != null)
				return false;
		} else if (!applicationsize.equals(other.applicationsize))
			return false;
		if (createddate == null) {
			if (other.createddate != null)
				return false;
		} else if (!createddate.equals(other.createddate))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PlayStoreDto [applicationName=" + applicationsName + ", applicationsize=" + applicationsize
				+ ", applicationType=" + applicationType + ", createddate=" + createddate + "]";
	}
	
	
	
}
