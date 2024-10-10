package com.xworkz.game.runner;

import com.xworkz.game.constant.GamestypeConstant;
import com.xworkz.game.service.Game;
import com.xworkz.games.Dto.GamesDto;

public class GamesRunner {

	public static void main(String[] args) {
		
        GamesDto game1 = new GamesDto("Game1", "Small", (byte) 5, 4, "Action");
        GamesDto game2 = new GamesDto("Game1", "Small", (byte) 5, 4, "Action");
        GamesDto game3 = new GamesDto("Game1", "Small", (byte) 5, 4, "Action");
        GamesDto game4 = new GamesDto("Game1", "Small", (byte) 5, 4, "Action");

        
        Game gameManager = new Game();

     
        System.out.println("Saving game 1: " + gameManager.onSave(game1));
        System.out.println("Saving game 2: " + gameManager.onSave(game2));
        System.out.println("Saving game 3: " + gameManager.onSave(game3));
        System.out.println("Saving game 4: " + gameManager.onSave(game4));


    
	}

}
