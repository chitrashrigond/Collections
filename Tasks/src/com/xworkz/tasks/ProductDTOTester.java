package com.xworkz.tasks;

import java.util.ArrayList;
import java.util.Collections;

public class ProductDTOTester {
	public static void main(String[] args) {

		ProductDTO dto1 = new ProductDTO("Cadbury Snack", "Cake", 100, 30.5d);
		ProductDTO dto2 = new ProductDTO("Parachute", "Coconut Oil", 50, 30.5d);
		ProductDTO dto3 = new ProductDTO("Cadboury", "Dairy Milk Silk", 180, 100.23d);

		ProductDTO dto4 = new ProductDTO("GoldWinner", "Sunflower", 170, 1000.0d);
		ProductDTO dto5 = new ProductDTO("Madhur", "Sugar", 60, 1000.0d);

		ArrayList<ProductDTO> list1 = new ArrayList<ProductDTO>();
		list1.add(dto3);
		list1.add(dto4);
		list1.add(dto5);

		ArrayList<ProductDTO> list2 = new ArrayList<ProductDTO>();
		list2.add(dto1);
		list2.add(dto2);

		list1.addAll(list2);
		System.out.println(list1);

		Collections.sort(list1);
		for (ProductDTO product : list1) {
			System.out.println("Ascending Order  " + product);
		}
	}
}
