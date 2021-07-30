package com.xworkz.streamT;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class USNTester {

	public static void main(String[] args) {

		Collection<String> usnList = new ArrayList<String>();
		usnList.add("4NM16CV404");
		usnList.add("4NM16CS425");
		usnList.add("4NM17ME406");
		usnList.add("4NM18CS200");
		usnList.add("4NM15CV426");
		usnList.add("4NM16ECE236");
		usnList.add("4NM20CS001");

		System.out.println("Number of Students " + usnList.size());
		Iterator<String> itr = usnList.iterator();
		while (itr.hasNext()) {
			String string = itr.next();
			if (string.contains("CS")) {
				System.out.println("CS Students USN :" + string);
			}
		}

		Collection<String> itr1 = usnList.stream().filter(c -> c.contains("CS")).collect(Collectors.toSet());

		System.out.println(itr1);

		usnList.stream().filter((c) -> c.contains("CS")).forEach(e -> System.out.println(e));

	}
}
