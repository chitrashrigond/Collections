package com.xworkz.july13.list;

public class StreetDTO {
private String name;
private int pincode;
private String landmark;
private String city;


public StreetDTO() {
	super();
	
}

public StreetDTO(String name, int pincode, String landmark, String city) {
	super();
	this.name = name;
	this.pincode = pincode;
	this.landmark = landmark;
	this.city = city;
}

@Override
public String toString() {
	return "StreetDTO [name=" + name + ", pincode=" + pincode + ", landmark=" + landmark + ", city=" + city + "]";
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getPincode() {
	return pincode;
}

public void setPincode(int pincode) {
	this.pincode = pincode;
}

public String getLandmark() {
	return landmark;
}

public void setLandmark(String landmark) {
	this.landmark = landmark;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
}



}
