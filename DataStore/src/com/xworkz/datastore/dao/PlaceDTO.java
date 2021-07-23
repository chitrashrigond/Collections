package com.xworkz.datastore.dao;
import java.io.Serializable;
import java.lang.Iterable;
import java.util.ArrayList;
import java.util.Comparator;

public class PlaceDTO implements Comparable{

	private int pincode;
	private String name;
	private int ticketPrice;

	 public int compareTo(PlaceDTO p)
	    {
	        return this.ticketPrice - p.ticketPrice;
	    }
	  PlaceDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PlaceDTO(int pincode, String name, int ticketPrice) {
		super();
		this.pincode = pincode;
		this.name = name;
		this.ticketPrice = ticketPrice;
	}

	/*class SortbyticketPrice implements Comparator<PlaceDTO> {

		public int compare(PlaceDTO a, PlaceDTO b) {
			return a.ticketPrice - b.ticketPrice;
		}
	}*/

	class Sortbyname implements Comparator<PlaceDTO> {
		// Used for sorting in ascending order of
		// name
		public int compare(PlaceDTO a, PlaceDTO b) {
			return a.name.compareTo(b.name);
		}
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
