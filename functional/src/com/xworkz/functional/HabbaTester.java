package com.xworkz.functional;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.xworkz.functional.constatnt.ReligionType;
import com.xworkz.functional.dao.HabbaDAO;
import com.xworkz.functional.dao.HabbaDAOImpl;
import com.xworkz.functional.dto.HabbaDTO;
import com.xworkz.functional.dto.MarketDTO;

public class HabbaTester {

	public static void main(String[] args) {

		HabbaDTO dto1 = new HabbaDTO("Deepawali", "SouthIndia", ReligionType.HINDU, 3, "Jamun", true);
		HabbaDTO dto2 = new HabbaDTO("Christmas", "India", ReligionType.CHRISTIAN, 1, "Cake", true);
		HabbaDTO dto3 = new HabbaDTO("Ramzan", "India", ReligionType.MUSLIM, 2, "Biriyani", false);

		HabbaDAO dao = new HabbaDAOImpl();
		boolean added = dao.ulisu(dto1);
		dao.ulisu(dto3);
		dao.ulisu(dto2);

		System.out.println(added);

		Collection<HabbaDTO> collection = Arrays.asList(dto1, dto2, dto3);

		collection.forEach((habba) -> System.out.println("Festival name :" + habba.getName()));
		collection.forEach((habba1) -> System.out.println("Festival name :" + habba1.getNoOfDays()));

		collection.forEach((dto) -> {
			if (dto.getNoOfDays() > 2) {
				System.out.println(dto.getName().toLowerCase());
			} else {
				System.out.println(dto.getName());
			}

		});

	}

}
