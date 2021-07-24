package com.xworkz.game.dao;

import com.xworkz.game.dto.GameDTO;

public interface GameDAO {

	boolean validateAndSave(GameDTO dto);

	

}
