package com.xworkz.functional.dto;

import com.xworkz.functional.constatnt.MarketType;

public class MarketDTO {

	private String name;
	private String Location;
	private int noOfShops;
	private MarketType type;

	public MarketDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MarketDTO(String name, String location, int noOfShops, MarketType type) {
		super();
		this.name = name;
		Location = location;
		this.noOfShops = noOfShops;
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Location == null) ? 0 : Location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + noOfShops;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "MarketDTO [name=" + name + ", Location=" + Location + ", noOfShops=" + noOfShops + ", type=" + type
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MarketDTO other = (MarketDTO) obj;
		if (Location == null) {
			if (other.Location != null)
				return false;
		} else if (!Location.equals(other.Location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noOfShops != other.noOfShops)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public int getNoOfShops() {
		return noOfShops;
	}

	public void setNoOfShops(int noOfShops) {
		this.noOfShops = noOfShops;
	}

	public MarketType getType() {
		return type;
	}

	public void setType(MarketType type) {
		this.type = type;
	}

}
