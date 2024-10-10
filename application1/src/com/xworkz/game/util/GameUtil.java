package com.xworkz.game.util;

import com.xworkz.games.Dto.GamesDto;

public class GameUtil {

	public static boolean checkDuplicate(GamesDto[] gameDto, GamesDto dto) {
		for (GamesDto game : gameDto) {
			if (game != null && game.equals(dto)) {
				return true;
			}
		}
		return false;

	}
}
