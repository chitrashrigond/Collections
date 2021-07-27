package com.xworkz.functional.dto;

import com.xworkz.functional.constatnt.MarketType;
import com.xworkz.functional.constatnt.ReligionType;

public class HabbaDTO {

	private String name;
	private String region;
	private ReligionType type;
	private int noOfDays;
	private String specialFood;
	private boolean wakeUPEarly;

	public HabbaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HabbaDTO(String name, String region, ReligionType type, int noOfDays, String specialFood,
			boolean wakeUPEarly) {
		super();
		this.name = name;
		this.region = region;
		this.type = type;
		this.noOfDays = noOfDays;
		this.specialFood = specialFood;
		this.wakeUPEarly = wakeUPEarly;
	}

	@Override
	public String toString() {
		return "HabbaDTO [name=" + name + ", region=" + region + ", type=" + type + ", noOfDays=" + noOfDays
				+ ", specialFood=" + specialFood + ", wakeUPEarly=" + wakeUPEarly + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + noOfDays;
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + ((specialFood == null) ? 0 : specialFood.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + (wakeUPEarly ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HabbaDTO other = (HabbaDTO) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noOfDays != other.noOfDays)
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (specialFood == null) {
			if (other.specialFood != null)
				return false;
		} else if (!specialFood.equals(other.specialFood))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (wakeUPEarly != other.wakeUPEarly)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public ReligionType getType() {
		return type;
	}

	public void setType(ReligionType type) {
		this.type = type;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public String getSpecialFood() {
		return specialFood;
	}

	public void setSpecialFood(String specialFood) {
		this.specialFood = specialFood;
	}

	public boolean isWakeUPEarly() {
		return wakeUPEarly;
	}

	public void setWakeUPEarly(boolean wakeUPEarly) {
		this.wakeUPEarly = wakeUPEarly;
	}

}
