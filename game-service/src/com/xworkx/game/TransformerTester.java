package com.xworkx.game;

import com.xworkz.game.dto.TransformerDTO;
import com.xworkz.game.service.TransformerService;
import com.xworkz.game.service.TransformerServiceImpl;

public class TransformerTester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TransformerDTO dto=new TransformerDTO("Chitrashri","Bhatkal","always","when im not happy","Cooking");
		
		TransformerService transformer=new TransformerServiceImpl();
		String saved=transformer.validateAndSave(dto);
		System.out.println(saved);
	}
}
