package com.xworkz.game.runner;

import java.time.LocalDate;

import com.xworkz.game.constant.ApplicationNameConstant;
import com.xworkz.game.constant.GamestypeConstant;
import com.xworkz.game.service.PlayStore;
import com.xworkz.games.Dto.PlayStoreDto;

public class PlayStoreRunner {

	public static void main(String[] args) {
		PlayStoreDto amazon=new PlayStoreDto(ApplicationNameConstant.AMAZON.toString(),"156mb",GamestypeConstant.BGMI.toString(),LocalDate.now());
		PlayStoreDto instagram=new PlayStoreDto(ApplicationNameConstant.INSTAGRAM.toString(),"156mb",GamestypeConstant.CHESS.toString(),LocalDate.now());
		PlayStoreDto whatsapp=new PlayStoreDto(ApplicationNameConstant.WHATSAPP.toString(),"156mb",GamestypeConstant.COC.toString(),LocalDate.now());

		System.out.println(amazon);
		
		PlayStore play =new PlayStore();
		System.out.println(play.onSave(whatsapp));
		System.out.println(play.onSave(instagram));
		System.out.println(play.onSave(amazon));
		
		
		play.getelements();
		System.out.println(play.getbyApplicationname("amazon"));
		System.out.println(play.getbyapplicationtype("BGMI"));
		System.out.println(play.getbyapplicationdate(LocalDate.now()));
	}

}
