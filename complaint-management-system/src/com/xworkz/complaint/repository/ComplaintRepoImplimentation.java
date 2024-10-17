package com.xworkz.complaint.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.complaint.dto.ComplaintDto;



public class ComplaintRepoImplimentation implements ComplaintRepo {
	List<ComplaintDto> list = new ArrayList<ComplaintDto>();
	@Override
	public boolean onSave(ComplaintDto complaintDto) {
		System.out.println("save running");
		return list.add(complaintDto);
	}

	@Override
	public List<ComplaintDto> getAll() {
		Collections.sort(list, Comparator.comparing(ComplaintDto::getCategory));
		Collections.sort((List)list);
		return list;
	}

	@Override
	public boolean updateById(int id, ComplaintDto complaintDto) {
		if (!list.isEmpty()) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getId() == id) {
					list.set(i, complaintDto);
				}
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteById(int id, ComplaintDto complaintDto) {
		if (!list.isEmpty()) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getId()== id) {
					list.removeAll(list);
				}
			}
			return true;
		}
		return false;
	}

}
