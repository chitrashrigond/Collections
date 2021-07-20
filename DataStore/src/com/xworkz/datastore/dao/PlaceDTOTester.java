package com.xworkz.datastore.dao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlaceDTOTester {

	
		    public static void main(String[] args)
		    {
		    	PlaceDTO  dto1=new PlaceDTO(5555, "Bhatkal", 100);
		    	PlaceDTO  dto2=new PlaceDTO(2342, "Murudeshwar", 50); 
		    	PlaceDTO  dto3=new PlaceDTO(2342, "Murudeshwar", 50);
		    	
		        ArrayList<PlaceDTO> place = new ArrayList<PlaceDTO>();
		        place.add(dto1);
		        place.add(dto2);
		        place.add(dto3);
		        
		        /*ArrayList<PlaceDTO> place = new ArrayList<PlaceDTO>();
		        place.add(new PlaceDTO(5555, "Bhatkal", 100));
		        place.add(new PlaceDTO(2342, "Murudeshwar", 50));
		        place.add(new PlaceDTO(8888, "Shiroor", 150));*/
		  
		  
		        System.out.println("Unsorted");
		        for (int i = 0; i < place.size(); i++)
		            System.out.println(place.get(i));
		  
		     /*   Collections.sort(place, new Sortbyname());
		  
		        System.out.println("Sorted by ticketPrice");
		       // for (int i = 0; i < place.size(); i++)
		            System.out.println(place.get(i));
		  
		     //   Collections.sort((List<PlaceDTO>) place, new Comparator());
		  
		        System.out.println("\nSorted by name");
		        for (int i = 0; i < place.size(); i++)
		            System.out.println(place.get(i));*/
	}

}
