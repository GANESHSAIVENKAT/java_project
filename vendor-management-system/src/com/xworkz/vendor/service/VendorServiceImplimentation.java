package com.xworkz.vendor.service;

import java.util.List;

import com.xworkz.vendor.dto.VendorDto;
import com.xworkz.vendor.repository.VendorRepo;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class VendorServiceImplimentation implements VendorService{

	private VendorRepo repo;
	@Override
	public String validate(VendorDto vendorDto) {
		System.out.println("Validate is running");
		if(vendorDto!=null){
			if(repo.onSave(vendorDto)) {
				return"Saved sucessfully";
			}
		}
		return "Not Saved sucessfully";
	}
	@Override
	public List<VendorDto> getAll() {
		
		return repo.getAll();
	}
	@Override
	public String updateById(int vendorId, VendorDto vendorDto) {
		if(vendorId>0) {
			if(repo.updateById(vendorId, vendorDto)) {
				return"Updatesucessfully";
			}
		}
		return "notupdated";
	}
	@Override
	public String deleteById(int vendorId, VendorDto vendorDto) {
		if(vendorId>0) {
			if(repo.deleteById(vendorId, vendorDto)) {
				return"deletesucessfully";
			}
		}
		return "notdeleted";
	}

}
