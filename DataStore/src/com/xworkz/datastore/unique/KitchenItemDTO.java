package com.xworkz.datastore.unique;

import java.io.Serializable;

public class KitchenItemDTO implements Serializable,Comparable<KitchenItemDTO>{

@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + ((usedFor == null) ? 0 : usedFor.hashCode());
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
		KitchenItemDTO other = (KitchenItemDTO) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (usedFor == null) {
			if (other.usedFor != null)
				return false;
		} else if (!usedFor.equals(other.usedFor))
			return false;
		return true;
	}


private String name;
private int price;
private String usedFor;
private String madeOf;


public KitchenItemDTO() {
	super();
	// TODO Auto-generated constructor stub
}


public KitchenItemDTO(String name, int price, String usedFor, String madeOf) {
	super();
	this.name = name;
	this.price = price;
	this.usedFor = usedFor;
	this.madeOf = madeOf;
}




public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getPrice() {
	return price;
}


public void setPrice(int price) {
	this.price = price;
}


public String getUsedFor() {
	return usedFor;
}


public void setUsedFor(String usedFor) {
	this.usedFor = usedFor;
}


public String getMadeOf() {
	return madeOf;
}


public void setMadeOf(String madeOf) {
	this.madeOf = madeOf;
}


@Override
public int compareTo(KitchenItemDTO arg0) {
	// TODO Auto-generated method stub
	return usedFor.compareToIgnoreCase(arg0.usedFor);
}



}
