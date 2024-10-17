package com.xworkz.complaint.service;

import java.util.List;

import com.xworkz.complaint.dto.ComplaintDto;
import com.xworkz.complaint.repository.ComplaintRepo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ComplaintServiceImplimentation implements ComplaintService{

	private ComplaintRepo repo;
	@Override
	public String validate(ComplaintDto complaintDto) {
		System.out.println("Validate is running");
		if(complaintDto!=null){
			if(repo.onSave(complaintDto)) {
				return"Saved sucessfully";
			}
		}
		return "Not Saved sucessfully";
	}

	@Override
	public List<ComplaintDto> getAll() {
		
		return repo.getAll();
	}

	@Override
	public String updateById(int id, ComplaintDto complaintDto) {
		if(id>0) {
			if(repo.updateById(id, complaintDto)) {
				return"Updatesucessfully";
			}
		}
		return "notupdated";
	}

	@Override
	public String deleteById(int id, ComplaintDto complaintDto) {
		if(id>0) {
			if(repo.deleteById(id, complaintDto)) {
				return"deletesucessfully";
			}
		}
		return "notdeleted";
	}

}
