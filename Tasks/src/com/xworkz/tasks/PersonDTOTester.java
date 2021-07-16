package com.xworkz.tasks;
import java.util.ArrayList;
import java.util.Collections;

import com.xworkz.tasks.PersonDTO;
public class PersonDTOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PersonDTO dto1=new PersonDTO("Ramesh",25,"r@gmail.com");
		PersonDTO dto2=new PersonDTO("Suresh",32,"s@gmail.com");
		PersonDTO dto3=new PersonDTO("Mahesh",18,"m@gmail.com");
		PersonDTO dto4=new PersonDTO("Nagesh",27,"n@gmail.com");
		PersonDTO dto5=new PersonDTO("Lakshmeesh",15,"l@gmail.com");
		
		 ArrayList<PersonDTO> list1 = new ArrayList<PersonDTO>();
		 list1.add(dto1);
		 list1.add(dto2);
		 
		 ArrayList<PersonDTO> list2 = new ArrayList<PersonDTO>();
		 list2.add(dto3);
		 list2.add(dto4);
		 list2.add(dto5);
		
		 list1.addAll(list2);
		 System.out.println(list1.size());
		 
		 Collections.sort(list1);
			for (PersonDTO person : list1) {
				System.out.println("hi   "+person);
			}
	}

}
