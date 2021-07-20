package com.xworkz.datastore.dto.dao;

import com.xworkz.datastore.dto.dao.TempleDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.xworkz.datastore.dto.dao.TempleDAO;

public class TempleDAOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TempleDTO dto1 = new TempleDTO(5, "MurudeshwaraTemple", "Murudeshwara", 20, true, 18, true, "Shiva", true);
		TempleDTO dto2 = new TempleDTO(9, "SodigaddeTemple", "Bhatkal", 15, true, 6, true, "Mahasati", false);
		TempleDTO dto3 = new TempleDTO(4, "KukkeSubramanyaTempla", "Subramanya", 70, true, 18, true, "Subramanya",
				true);
		TempleDTO dto4 = new TempleDTO(6, "Dharmasthala", "Beltangadi", 100, true, 75, true, "Shiva", true);
		TempleDTO dto5 = new TempleDTO(1, "MantralayaTemple", "Mantralaya", 50, true, 50, true, "RaghavendraSwami",
				true);
		TempleDTO dto6 = new TempleDTO(2, "MarikambaTemple", "Sirsi", 40, true, 30, true, "Marikambe", false);

		TempleDAO dao = new TempleDAOImpl();
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		dao.save(dto4);
		dao.save(dto5);
		dao.save(dto6);

		TempleDTO deletedto = new TempleDTO(4, "KukkeSubramanyaTempla", "Subramanya", 25, true, 18, true, "Subramanya",
				true);
		dao.delete(deletedto);
		System.out.println("*****" + dao.totalItems());

		TempleDTO findFirstItemdto = new TempleDTO();
		dao.findFirstItem();
		System.out.println("First item" + dao.findFirstItem());

		TempleDTO findLastItemdto = new TempleDTO();
		dao.findLastItem();
		System.out.println("Last item" + dao.findLastItem());

		TempleDTO findByname = dao.findByName("MurudeshwaraTemple");
		System.out.println("find by name" + findByname);

		TempleDTO findByLocation = dao.findByLocation("Bhatkal");
		System.out.println("find by Location" + findByLocation);

		TempleDTO findByLocationAndName = dao.findByLocationAndName("Beltangadi", "Dharmasthala");
		System.out.println("find by Location And Name" + findByLocationAndName);

		Collection<TempleDTO> all = dao.findAll();
		
		for(TempleDTO temple :all){
			System.out.println("find  All" + temple);	
		
		}
		
		
		Collection<TempleDTO> location = dao.findAllTempleBYLocationStartWith('B');
		for(TempleDTO temp:location){
		System.out.println("**************"+temp);	
		}
		Collection<TempleDTO> cost = dao.findAllTempleBYEntryFeesGreaterThan(20);
		System.out.println(cost);
		
		Collection<TempleDTO> findAllTempleBYNoOfPoojarisGreaterThan=dao.findAllTempleBYNoOfPoojarisGreaterThan(10);
			//System.out.println("AllTempleBYNoOfPoojarisGreaterThan 10 "+findAllTempleBYNoOfPoojarisGreaterThan);
		
		
		Collection<String> allLocation=dao.findAllLocation();
		for(String all1: allLocation){
		System.out.println("******************"+all1);
		}
		

		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
			
	}

	}

