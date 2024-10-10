package com.xworkz.game.service;

import java.time.LocalDate;

import com.xworkz.game.util.PlayStoreUtil;
import com.xworkz.games.Dto.PlayStoreDto;

public class PlayStore {
	
	private PlayStoreDto[] playstoredto=new PlayStoreDto[3];
	private int index;
	
	public String onSave(PlayStoreDto dto){
		if(dto==null) {
			return"not save";
		}else {
			boolean check = PlayStoreUtil.checkDuplicate(playstoredto, dto);
			if(check==false) {
				if(this.index<playstoredto.length) {
					playstoredto[index] =dto;
					index++;
					return"Saved";
				}
			}
			
		}
		return "not save";
		
		
	}

	public void getelements() {
		for(PlayStoreDto dto:playstoredto){
			System.out.println("elements are"+dto);
		}
	}
	public PlayStoreDto getbyApplicationname(String applicationName) {
		System.out.println("getbyApplicationname is running ");
		for(PlayStoreDto dto:playstoredto){
			if(dto.getApplicationName().equalsIgnoreCase(applicationName)) {
				return dto;
			}
			
		}
		
		return null;
		
	}
	public PlayStoreDto getbyapplicationtype(String applicationType) {
		System.out.println("getbyapplicationtype");
		for(PlayStoreDto dto:playstoredto){
			if(dto!=null&&dto.getApplicationType().equalsIgnoreCase(applicationType)) {
				return dto;
			}
		}
		return null;
	}
	public PlayStoreDto getbyapplicationdate(LocalDate localDate) {
		System.out.println("getbyapplicationdate");
		for(PlayStoreDto dto:playstoredto){
			if(dto.getCreateddate().equals(localDate)) {
				return dto;
			}
		}
		return null;
	}
}



