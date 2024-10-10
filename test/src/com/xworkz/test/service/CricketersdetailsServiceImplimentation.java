package com.xworkz.test.service;


import com.xworkz.test.dto.CricketersListDto;
import com.xworkz.test.repositry.CricketersdetailsRepositry;
import com.xworkz.test.repositry.CricketersdetailsRepositryImplimentation;

public class CricketersdetailsServiceImplimentation implements CricketersdetailsService {
	CricketersdetailsRepositry repo=new CricketersdetailsRepositryImplimentation();

	@Override
	public boolean setArraySize(int arraySize) {
		if (arraySize > 0) {
			System.out.println("Array is taken");
			repo.setArraySize(arraySize);
			return true;
		} else {
			System.out.println("Array is not taken");
		}
		return false;
	}

	@Override
	public String onSaveData(CricketersListDto cricketersListDto) {
		System.out.println("onSave service is running");
		if (cricketersListDto != null) {
			if (!repo.duplicateCheck(cricketersListDto)) {
				repo.onSaveData(cricketersListDto);
				return "Saved..";
			}
		}
		return "Not saved..";
	}

	@Override
	public void read() {
		CricketersListDto[] read1 = repo.read();
		for (CricketersListDto cricketersListDto : read1) {
			System.out.println("CricketData" + cricketersListDto);

		}

	}
		
	

	@Override
	public String onUpdate(CricketersListDto cricketersListDto, int newjnumber) {
		if (cricketersListDto != null) {
	          
			if (repo.onUpdate(cricketersListDto, newjnumber)) {
				
				return "Updated Successfully";
			}
		}
		return "Not Updated";
	}


	@Override
	public String deleteData(int jnumber) {
	    if (jnumber != 0) {
	        if (repo.deleteData(jnumber)) {
	            return "Deleted successfully";
	        }
	    }
	    return "Deletion failed";

	}

}
