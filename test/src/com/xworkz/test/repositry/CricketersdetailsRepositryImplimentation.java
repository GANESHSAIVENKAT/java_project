package com.xworkz.test.repositry;

import com.xworkz.test.dto.CricketersListDto;

public class CricketersdetailsRepositryImplimentation implements CricketersdetailsRepositry {
	private CricketersListDto[] listofarray;
	private int index = 0;

	@Override
	public boolean setArraySize(int arraySize) {
		listofarray = new CricketersListDto[arraySize];
		if (listofarray.length == arraySize) {
			System.out.println("Array is given");
		} else {
			System.out.println("Array is not given");
		}
		return false;
	}

	@Override
	public boolean onSaveData(CricketersListDto cricketersListDto) {
		System.out.println("On Save is running");
		if (listofarray != null) {
			if (this.index < this.listofarray.length) {
				listofarray[index] = cricketersListDto;
				index++;
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean duplicateCheck(CricketersListDto dto) {
		if (listofarray != null) {
			for (int i = 0; i < listofarray.length; i++) {
				if (listofarray[i] != null && listofarray[i].equals(dto)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public CricketersListDto[] read() {

		return listofarray;
	}

	@Override
	public boolean onUpdate(CricketersListDto cricketersListDto, int newjnumber) {
		for (int i = 0; i < listofarray.length; i++) {
			if (listofarray[i] != null && listofarray[i].equals(cricketersListDto)) {
				listofarray[i] = cricketersListDto;
				cricketersListDto.setJnumber(newjnumber);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteData(int jnumber) {
		for (int i = 0,j=0; i < listofarray.length; i++) {
			if (listofarray[i] != null && listofarray[i].getJnumber() == jnumber) {
				listofarray[i]=listofarray[j++];

				return true;
			}
		}
		return false;
	}
    public boolean displayplayerRunRateBetween30And50() {
        System.out.println("Cricketers with run rate between 30 and 50:");
        for (CricketersListDto cricketer : listofarray) {
            if (cricketer != null && cricketer.getRunrate() < 50 && cricketer.getRunrate() > 30) {
                System.out.println(cricketer);
                return true;
            }
        }
		return false;
    }
}
