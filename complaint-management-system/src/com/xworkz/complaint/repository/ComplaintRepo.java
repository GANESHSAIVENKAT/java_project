package com.xworkz.complaint.repository;

import java.util.List;

import com.xworkz.complaint.dto.ComplaintDto;


public interface ComplaintRepo {


	boolean onSave(ComplaintDto complaintDto);
	List<ComplaintDto> getAll();
	boolean updateById(int id,ComplaintDto complaintDto);
	boolean deleteById(int id,ComplaintDto complaintDto);
}
