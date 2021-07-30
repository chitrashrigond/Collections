package com.xworkz.streamT;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WatchBrandTester {

	public static void main(String[] args) {
		Collection<String> watchBrand = new ArrayList<String>();
		watchBrand.add("Faststrack");
		watchBrand.add("Tag Heuer");
		watchBrand.add("Omega SA");
		watchBrand.add("Tissot");
		watchBrand.add("Hublot");
		watchBrand.add("Tag Heuer");

		/*
		 * Iterator<String> itr=watchBrand.iterator();
		 *  while (itr.hasNext()) {
		 * String string=itr.next(); if(string.startsWith("T"))
		 * System.out.println(string); }
		 */

		Collection<String> brand=watchBrand.stream().filter(c ->
		c.startsWith("T")).collect(Collectors.toList());
		System.out.println(brand);

		watchBrand.stream().filter(c -> c.startsWith("T"))
				.forEach(e -> System.out.println(e));

	}
}
