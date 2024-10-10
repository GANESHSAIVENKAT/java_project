package com.xworkz.game.service;

import com.xworkz.game.util.GameUtil;
import com.xworkz.games.Dto.GamesDto;

public class Game {
	private GamesDto gamesdto[]=new GamesDto[3];
	private int index;
	public String onSave(GamesDto dto) {
		if(dto==null) {
			return "notsaved";
		}else {
			boolean duplicateres=GameUtil.checkDuplicate(gamesdto, dto);
			System.out.println(duplicateres);
			if(duplicateres==false) {
				if(this.index<gamesdto.length) {
					 gamesdto[index]=dto;
					 index++;
					 return"Saved";
				}
			}
		}
		
		return "not saved";

	}
}
