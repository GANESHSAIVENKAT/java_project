package com.xworkz.game.util;


import com.xworkz.games.Dto.PlayStoreDto;


public class PlayStoreUtil {

	public static boolean checkDuplicate(PlayStoreDto[] playstoredto, PlayStoreDto dto) {
		for (PlayStoreDto play : playstoredto) {
			if (play != null && play.equals(dto)) {
				return true;
			}
		}

		return false;

	}

}
