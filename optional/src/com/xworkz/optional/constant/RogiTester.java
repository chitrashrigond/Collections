package com.xworkz.optional.constant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import com.xworkz.optional.dao.RogiDAO;
import com.xworkz.optional.dao.RogiDAOImpl;
import com.xworkz.optional.dto.RogiDTO;
import com.xworkz.optional.util.RogiSearch;

public class RogiTester {

	public static void main(String[] args) {


		RogiDTO dto1 = new RogiDTO(6, "Samanth", 85, "Fever", true);
		RogiDTO dto2 = new RogiDTO(2, "Ajay", 42, "Cancer", false);
		RogiDTO dto3 = new RogiDTO(8, "Samskrati", 15, "Fracture", true);
		RogiDTO dto4 = new RogiDTO(1, "Ramakanta", 10, "ChickenFox", true);
		RogiDTO dto5 = new RogiDTO(15, "Sanjana", 65, "Corona", false);

		Collection<RogiDTO> collection = new ArrayList<RogiDTO>();
		RogiDAO dao=new RogiDAOImpl();
		boolean added = collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		
		
		Optional<RogiDTO> rogione = dao.findOne();
		System.out.println(rogione.get().getName());
		
		
		Optional<RogiDTO> rogiMaxAge = dao.findByMaxAge();
		System.out.println(rogiMaxAge.get().toString());
		
		Optional<RogiDTO> rogiMinAge = dao.findByMinAge();
		System.out.println(rogiMinAge.get().toString());
	
		Iterator<RogiDTO> itr = collection.iterator();
		System.out.println("Added "+added);
		
		
		Optional<Integer> value=dao.totalSize();
System.out.println("Vattu Rogigala Sanke :"+value.orElse(dto1.getAge()));

/*Optional<RogiDTO> dto=dao.findByMaxAge();
if()
System.out.println(dto);*/

}
}
