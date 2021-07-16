package com.xworkz.tasks;

import java.io.Serializable;

public class AlcoholDTO implements Serializable, Comparable<AlcoholDTO> {
	private String brand;
	private int price;
	private boolean scortch;
	private double quantity;
	private AlcoholType type;

	public AlcoholDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AlcoholDTO(String brand, int price, boolean scortch, double quantity, AlcoholType type) {
		super();
		this.brand = brand;
		this.price = price;
		this.scortch = scortch;
		this.quantity = quantity;
		this.type = type;
	}

	@Override
	public String toString() {
		return "AlcoholDTO [brand=" + brand + ", price=" + price + ", scortch=" + scortch + ", quantity=" + quantity
				+ ", type=" + type + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isScortch() {
		return scortch;
	}

	public void setScortch(boolean scortch) {
		this.scortch = scortch;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public AlcoholType getType() {
		return type;
	}

	public void setType(AlcoholType type) {
		this.type = type;
	}
@Override
	public int compareTo(AlcoholDTO ref) {
		System.out.println("compared  " + ref);
		String refbrand = ref.getBrand();
		
		if (this.brand.compareTo(brand)==0)
			return 0;
		if (this.brand.compareTo(brand)>0)
			return 1;
		else if (this.brand.compareTo(brand)<0)
			return -1;
		return 0;
	}

}
