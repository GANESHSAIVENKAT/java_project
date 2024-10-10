package com.google.pubapplication.pub;

import java.time.LocalDate;
import java.time.LocalDateTime;



public class PubDto {

    private String pubName;
    private LocalDate openingDate;
    private LocalDateTime lastVisitTime;
    
    public PubDto() {
    	
    }
    
    public PubDto(String pubName, LocalDate openingDate, LocalDateTime lastVisitTime) {
        this.pubName = pubName;
        this.openingDate = openingDate;
        this.lastVisitTime = lastVisitTime;
    }

	public String getPubName() {
		return pubName;
	}

	public void setPubName(String pubName) {
		this.pubName = pubName;
	}

	public LocalDate getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(LocalDate openingDate) {
		this.openingDate = openingDate;
	}

	public LocalDateTime getLastVisitTime() {
		return lastVisitTime;
	}

	public void setLastVisitTime(LocalDateTime lastVisitTime) {
		this.lastVisitTime = lastVisitTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lastVisitTime == null) ? 0 : lastVisitTime.hashCode());
		result = prime * result + ((openingDate == null) ? 0 : openingDate.hashCode());
		result = prime * result + ((pubName == null) ? 0 : pubName.hashCode());
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
		PubDto other = (PubDto) obj;
		if (lastVisitTime == null) {
			if (other.lastVisitTime != null)
				return false;
		} else if (!lastVisitTime.equals(other.lastVisitTime))
			return false;
		if (openingDate == null) {
			if (other.openingDate != null)
				return false;
		} else if (!openingDate.equals(other.openingDate))
			return false;
		if (pubName != other.pubName)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pub [pubName=" + pubName + ", openingDate=" + openingDate + ", lastVisitTime=" + lastVisitTime + "]";
	}
	
}
