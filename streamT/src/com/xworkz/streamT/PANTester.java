package com.xworkz.streamT;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class PANTester {

	public static void main(String[] args) {
		Collection<String> pan=new ArrayList<String>();
		pan.add("AF1122H366K");
		pan.add("KF1122H366K");
		pan.add("AG1122H366K");
		pan.add("DF1122H366K");
		pan.add("Am1122H366K");
		
		Collection<String> panNo=pan.stream().filter((n)->n.startsWith("A")).collect(Collectors.toSet());
	System.out.println(panNo);
	
	pan.stream().filter((n)->n.startsWith("A")).collect(Collectors.toSet()).forEach(System.out::println);
	}

}
