package com.xworkz.game.service;

import com.xworkz.game.dao.GameDAO;
import com.xworkz.game.dao.GameDAOImpl;
import com.xworkz.game.dto.GameDTO;
import com.xworkz.game.service.GameService;

public class GameServiceImpl implements GameService{

	@Override
	public String validateAndSave(GameDTO dto) {
		GameDAO dao=new GameDAOImpl();
		boolean nameValid=false;
		boolean versionValid=false;
		boolean developedByValid=false;
		boolean maxPlayerValid=false;
		boolean memoryRequiredValid=false;
	
		if(dto!=null)
		System.out.println("dto is not null");
		String name=dto.getName();
		if(name!=null&&!name.isEmpty()&&name.length()>=2&&name.length()<=10){
			System.out.println("name is valid");
			nameValid=true;
		}else{
			System.out.println("name is invalid");
			nameValid=false;
		}
		String version=dto.getVersion();
		if(version!=null&&!version.isEmpty()&&version.length()>=2&&version.length()<=50){
			System.out.println("Version is valid");
			versionValid=true;
		}else{
			System.out.println("version is invalid");
			versionValid=false;
		}
			String developedBy=dto.getDevelopedBy();
			if(developedBy!=null&&!developedBy.isEmpty()&&developedBy.length()>=3&&developedBy.length()<=15){
				System.out.println("developedBy is valid");
				developedByValid=true;
			}else{
				System.out.println("developedBy is invalid");
				developedByValid=false;
			}
				int maxPlayer=dto.getMaxPlayer();
				if(maxPlayer!=0&&maxPlayer>=1&&maxPlayer<=8){
					System.out.println("maxPlayers is valid");
					maxPlayerValid=true;
				}else{
					System.out.println("maxPlayers is invalid");
					maxPlayerValid=false;
				}
					double memoryRequired=dto.getMemoryRequired();
					if(memoryRequired!=0.00&&memoryRequired>=500&&memoryRequired<=500000){
						System.out.println("Version is valid");
						memoryRequiredValid=true;
					}else{
						System.out.println("version is invalid");
						memoryRequiredValid=false;
		}if(nameValid&&versionValid&&developedByValid&&maxPlayerValid&&memoryRequiredValid){
			System.out.println("Data is valid ");
			dao.validateAndSave(dto);
		return "Success";
		}
				
		return "Failed";
				}}



