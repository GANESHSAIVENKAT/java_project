package com.google.pubapplication.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.google.pubapplication.constant.PubName;
import com.google.pubapplication.pub.PubDto;
import com.google.pubapplication.service.Pubs;

public class PubRunner {

	public static void main(String[] args) {
		PubDto pubdto = new PubDto(PubName.THE_BROKEN_SWORD.toString(), LocalDate.of(2017, 6, 20),
				LocalDateTime.of(2024, 2, 21, 4, 30, 18));
		PubDto pubs = new PubDto(PubName.THE_BROKEN_SWORD.toString(), LocalDate.of(2017, 6, 20),
				LocalDateTime.of(2024, 2, 21, 4, 30, 18));
		Pubs pub= new Pubs();
		System.out.println(pub.onSave(pubdto));
		System.out.println(pub.onSave(pubs));

		

	}

}
