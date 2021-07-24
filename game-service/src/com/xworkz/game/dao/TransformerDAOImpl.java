package com.xworkz.game.dao;

import com.xworkz.game.dto.TransformerDTO;

public class TransformerDAOImpl implements TransformerDAO{

	@Override
	public boolean validateAndSave(TransformerDTO dto) {
		System.out.println("Invoked TransformerDTO");
		return false;
	}

}
