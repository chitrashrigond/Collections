package com.xworkz.july13.list;

import java.util.ArrayList;
import java.util.List;
public class Book {
	
	public static void main(String[] args){
	List<String> list= new ArrayList<String>();  
	list.add("kannada");
	list.add("English");
	list.add("Hindi");
	list.add("Sanskrit");
	
	System.out.println(list.size());
	list.remove(1);
	System.out.println("after removing size of list "+list.size());
	}
	

}
