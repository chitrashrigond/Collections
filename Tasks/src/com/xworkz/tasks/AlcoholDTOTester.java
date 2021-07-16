package com.xworkz.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlcoholDTOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlcoholDTO alcohol1=new AlcoholDTO("Bacardi",500,true,100.25,AlcoholType.RUM); 
		AlcoholDTO alcohol2=new AlcoholDTO("Simrnoff",600,true,200.25,AlcoholType.BEER); 
		AlcoholDTO alcohol3=new AlcoholDTO("grey goose",700,true,300.25,AlcoholType.VODKA); 
		AlcoholDTO alcohol4=new AlcoholDTO("imperial blue",800,true,400.25,AlcoholType.RUM); 
		AlcoholDTO alcohol5=new AlcoholDTO("royal stag",900,true,500.25,AlcoholType.GIN); 
		
		ArrayList<AlcoholDTO> list1=new ArrayList<AlcoholDTO>();
		list1.add(alcohol1);
		list1.add(alcohol2);
		list1.add(alcohol3);
		
	ArrayList<AlcoholDTO> list2=new ArrayList<AlcoholDTO>();
		list1.add(alcohol4);
		list1.add(alcohol5);
		
		 list1.addAll(list2);
		 System.out.println(list1.size());
		 
		 Collections.sort(list1,Collections.reverseOrder());
			for (AlcoholDTO alcohol : list1) {
				System.out.println("hi   "+alcohol);
				System.out.println("**************   "+alcohol.getBrand());
			}
	
		
	}

}
