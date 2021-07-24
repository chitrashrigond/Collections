package com.xworkx.game;

import com.xworkz.game.dto.GameDTO;
import com.xworkz.game.service.GameService;
import com.xworkz.game.service.GameServiceImpl;

public class GameTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GameDTO dto=new GameDTO("Ludo","215","ABCD",4,1000,true);
		
		GameService game=new GameServiceImpl();
		String saved=game.validateAndSave(dto);
		System.out.println(saved);
	}

}
