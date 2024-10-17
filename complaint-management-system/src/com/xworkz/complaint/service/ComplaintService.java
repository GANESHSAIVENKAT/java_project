package com.xworkz.complaint.service;

import java.util.List;

import com.xworkz.complaint.dto.ComplaintDto;

public interface ComplaintService {
	String validate(ComplaintDto complaintDto);
	List<ComplaintDto> getAll();
	String updateById(int id,ComplaintDto complaintDto);
	String deleteById(int id,ComplaintDto complaintDto);
}
