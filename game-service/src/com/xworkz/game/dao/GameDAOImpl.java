package com.xworkz.game.dao;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.game.dto.GameDTO;

public class GameDAOImpl implements GameDAO{
	private Collection<GameDTO> collection=new  HashSet<GameDTO>();
	@Override
	public boolean validateAndSave(GameDTO dto) {
		System.out.println("Invoked save Method");
		return this.collection.add(dto);
	}
	

}
