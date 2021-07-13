package com.xworkz.july13.list;

import java.util.ArrayList;

import java.util.List;
import java.util.ListIterator;

import com.xworkz.july13.list.StreetDTO;

public class StreetDTOTester {



	public static void main(String[] args) {
		StreetDTO street1 = new StreetDTO("ABC", 581321, "Temple", "Bhatkal");
		StreetDTO street2 = new StreetDTO("DEF", 251321, "School", "Honnavar");
		StreetDTO street3 = new StreetDTO("GHI", 321341, "Hospital", "Kumta");
		StreetDTO street4 = new StreetDTO("JKL", 583651, "College", "Bayndoor");

		List<StreetDTO> UKstreet = new ArrayList<StreetDTO>();
		UKstreet.add(street1);
		UKstreet.add(street2);
		UKstreet.add(street3);
		UKstreet.add(street4);
		System.out.println("Uttar Kannada Street size " + UKstreet.size());

		ListIterator<StreetDTO> itr = UKstreet.listIterator(2);
		while (itr.hasPrevious()) {

			StreetDTO c = itr.previous();
			System.out.println("ListIterator" + c);

		}
		while (itr.hasNext()) {

			StreetDTO c = itr.next();
			System.out.println("Iterator" + c);

		}

		StreetDTO streetA = new StreetDTO("ABC", 581321, "Temple", "Byndoor");
		StreetDTO streetB = new StreetDTO("DEF", 251321, "School", "Shiroor");
		StreetDTO streetC = new StreetDTO("GHI", 321341, "Hospital", "Kumta");

		List<StreetDTO> Ustreet = new ArrayList<StreetDTO>();
		Ustreet.add(streetA);
		Ustreet.add(streetB);
		Ustreet.add(streetC);
		System.out.println("Set before retainAll() operation : " + Ustreet);

		System.out.println("Udupi Street size " + Ustreet.size());

		List<StreetDTO> location = new ArrayList<StreetDTO>();
		location.addAll(UKstreet);
		location.addAll(Ustreet);
		System.out.println("After adding all Street " + location.size());

		System.out.println("Are all the contents equal :" + UKstreet.containsAll(Ustreet));

		UKstreet.retainAll(Ustreet);
		System.out.println("Set after retainAll() operation : " + UKstreet);

		String myStr = "Hello how are you";
		System.out.println(myStr.indexOf("you"));

		String myStr1 = "Hello how are you";
		System.out.println("last index" + myStr1.indexOf("you"));

		UKstreet.removeAll(UKstreet);
		System.out.println("After removing street Size " + UKstreet.size());

	}

}
