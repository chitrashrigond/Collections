package com.xworkz.game.service;

import com.xworkz.game.dto.TransformerDTO;

public class TransformerServiceImpl implements TransformerService{
	@Override
	public String validateAndSave(TransformerDTO dto) {
		boolean nameValid=false;
		boolean placeValid=false;
		boolean happyValid=false;
		boolean sadValid=false;
		boolean likeToDoValid=false;
	
		if(dto!=null)
		System.out.println("dto is not null");
		String name=dto.getName();
		if(name!=null&&!name.isEmpty()&&name.length()>=5&&name.length()<=50){
			System.out.println("name is valid");
			nameValid=true;
		}else{
			System.out.println("name is invalid");
			nameValid=false;
		}
		String place=dto.getPlace();
		if(place!=null&&!place.isEmpty()&&place.length()>=4&&place.length()<=20){
			System.out.println("place is valid");
			placeValid=true;
		}else{
			System.out.println("place is invalid");
			placeValid=false;
		}
			String happy=dto.getHappy();
			if(happy!=null&&!happy.isEmpty()&&happy.length()>=3&&happy.length()<=15){
				System.out.println("happy is valid");
				happyValid=true;
			}else{
				System.out.println("happy is invalid");
				happyValid=false;
			}
			String sad=dto.getHappy();
			if(sad!=null&&!sad.isEmpty()&&sad.length()>=3&&sad.length()<=15){
				System.out.println("sad is valid");
				sadValid=true;
			}else{
				System.out.println("sad is invalid");
				sadValid=false;
			}
			String likeToDo=dto.getLikeToDo();
			if(likeToDo!=null&&!likeToDo.isEmpty()&&likeToDo.length()>=3&&likeToDo.length()<=15){
				System.out.println("likeToDo is valid");
				likeToDoValid=true;
			}else{
				System.out.println("likeToDo is invalid");
				likeToDoValid=false;
			}
				
		if(nameValid&&placeValid&&happyValid&&sadValid&&likeToDoValid){
			System.out.println("Data is valid ");
		return "Success";
		}
				
		return "Failed";
				}}


