package com.xworkz.datastore.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StudentDTOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDTO dto1=new StudentDTO("Chitra",25);
		StudentDTO dto2=new StudentDTO("Ambika",26);
		StudentDTO dto3=new StudentDTO("Kavya",22);
		StudentDTO dto4=new StudentDTO("Ramya",30);
		StudentDTO dto5=new StudentDTO("Soumya",24);
		StudentDTO dto6=new StudentDTO("Barati",18);
		
 Collection<StudentDTO> list=new ArrayList<StudentDTO>();
list.add(dto1);
list.add(dto2);
list.add(dto3);
list.add(dto4);
list.add(dto5);
list.add(dto6); 

System.out.println("No Of Students in a class : "+list.size());

((List<StudentDTO>) list).indexOf("Chitra");
System.out.println(((ArrayList<StudentDTO>) list).indexOf(list));

StudentDTO student=()findAll();
System.out.println(((Object) list).findAll());
	}



	}

}
