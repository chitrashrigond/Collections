package com.xworkz.datastore.unique;
import com.xworkz.datastore.unique.KitchenItemDTO;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.xworkz.datastore.unique.KitchenItemDAO;
import com.xworkz.datastore.unique.KitchenItemDAOImpl;
public class KitchenItemDAOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KitchenItemDTO dto1=new KitchenItemDTO("Skillet pan",2000,"Breakfast","CastIron");
		KitchenItemDTO dto2=new KitchenItemDTO("Spatula",125,"ForFrying","Wood");
		KitchenItemDTO dto3=new KitchenItemDTO("Rolling Board",137,"Roll Chapati","Wood");
		KitchenItemDTO dto4=new KitchenItemDTO("Container",179,"Store","Plastic");
		
		
		
		KitchenItemDAO dao = new KitchenItemDAOImpl();
		boolean save = dao.saveUnique(dto1);
		System.out.println(save);
		dao.saveUnique(dto4);
		dao.saveUnique(dto2);
		dao.saveUnique(dto3);
		
		Collection<KitchenItemDTO> collection1 = dao.findAllSortByUsedFor();
		for (KitchenItemDTO kitchenItem : collection1) {
			System.out.println(kitchenItem);
		}

		Collection<KitchenItemDTO> collection2 = dao.findAllSortByUsedForDesc();
		for (KitchenItemDTO kitchenItem : collection2) {
			System.out.println(kitchenItem);
		}

		Collection<KitchenItemDTO> collection3 = dao.findAllSortByName();
		for (KitchenItemDTO kitchenItem : collection3) {
			System.out.println(kitchenItem);
		}

		Collection<KitchenItemDTO> collection4 = dao.findAllSortByPriceDesc();
		for (KitchenItemDTO kitchenItem : collection4) {
			System.out.println(kitchenItem);
		}

		
	}


	     }
	           
	


