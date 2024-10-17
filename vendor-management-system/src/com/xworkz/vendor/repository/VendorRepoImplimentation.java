package com.xworkz.vendor.repository;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


import com.xworkz.vendor.dto.VendorDto;

public class VendorRepoImplimentation implements VendorRepo {
	LinkedList<VendorDto> list = new LinkedList<VendorDto>();

	@Override
	public boolean onSave(VendorDto vendorDto) {
		System.out.println("save running");
		return list.add(vendorDto);
	}

	@Override
	public List<VendorDto> getAll() {

		Collections.sort((List)list);
		return list;
	}

	@Override
	public boolean updateById(int vendorId, VendorDto vendorDto) {
		if (!list.isEmpty()) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getVendorId() == vendorId) {
					list.set(i, vendorDto);
				}
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteById(int vendorId, VendorDto vendorDto) {
		if (!list.isEmpty()) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getVendorId() == vendorId) {
					list.removeAll(list);
				}

			}
			return true;
		}
		return false;
	}

}
