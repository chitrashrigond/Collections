package com.xworkz.functional;

import java.util.Arrays;
import java.util.Collection;

import com.xworkz.functional.dao.MarketDAO;
import com.xworkz.functional.dao.MarketDAOImpl;
import com.xworkz.functional.dto.HabbaDTO;
import com.xworkz.functional.dto.MarketDTO;
import com.xworkz.functional.constatnt.MarketType;

public class MarketTester {
	public static void main(String[] args) {

		MarketDTO dto1 = new MarketDTO("AAAA", "Bhatkal", 10, MarketType.CHICKEN);
		MarketDTO dto2 = new MarketDTO("EEEE", "Honnavar", 20, MarketType.VEGETABLE);
		MarketDTO dto3 = new MarketDTO("BBBB", "Shiroor", 16, MarketType.FISH);
		MarketDTO dto4 = new MarketDTO("ZZZZ", "Shirali", 4, MarketType.VEGITABLE_FISH_CHICKEN);
		MarketDTO dto5 = new MarketDTO("NNNN", "Kumta", 7, MarketType.CHICKEN);

		MarketDAO dao = new MarketDAOImpl();
		boolean added = dao.save(dto1);
		dao.save(dto5);
		dao.save(dto3);
		dao.save(dto2);
		dao.save(dto4);
		System.out.println("saved : " + added);
		Collection<MarketDTO> collection = Arrays.asList(dto1, dto2, dto3,dto4,dto5);
		
		collection.forEach((market) -> System.out.println("Market name :" + market.getName()));


		collection.forEach((dto) -> {
			if (dto.getNoOfShops() > 10) {
				System.out.println(dto.getName().toLowerCase());
			} else {
				System.out.println(dto.getName());
			}

		});
		/*Collection<MarketDTO> dt2 = dao.findAll((k) -> k.getLocation().equals("Kumta"));
		for (MarketDTO marketDTO : dt2) {
			System.out.println("****************** " + marketDTO);

		}*/

	}
}
