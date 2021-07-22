package com.xworkz.datastore.dto.dao;

import java.io.Serializable;
import java.util.List;

import com.xworkz.datastore.dao.RiverDTO;

public class TempleDTO implements Serializable{
	private int id;
	private String name;
	private String location;
	private int EntryFee;
	private boolean specialPrasada;
	private int noOfPoojaries;
	private boolean male;
	private String mainGod;
	private boolean kalyani;

	public TempleDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TempleDTO(int id, String name, String location, int entryFee, boolean specialPrasada, int noOfPoojaries,
			boolean male, String mainGod, boolean kalyani) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		EntryFee = entryFee;
		this.specialPrasada = specialPrasada;
		this.noOfPoojaries = noOfPoojaries;
		this.male = male;
		this.mainGod = mainGod;
		this.kalyani = kalyani;
	}

	@Override
	public String toString() {
		return "TempleDTO [id=" + id + ", name=" + name + ", location=" + location + ", EntryFee=" + EntryFee
				+ ", specialPrasada=" + specialPrasada + ", noOfPoojaries=" + noOfPoojaries + ", male=" + male
				+ ", mainGod=" + mainGod + ", kalyani=" + kalyani + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getEntryFee() {
		return EntryFee;
	}

	public void setEntryFee(int entryFee) {
		EntryFee = entryFee;
	}

	public boolean isSpecialPrasada() {
		return specialPrasada;
	}

	public void setSpecialPrasada(boolean specialPrasada) {
		this.specialPrasada = specialPrasada;
	}

	public int getNoOfPoojaries() {
		return noOfPoojaries;
	}

	public void setNoOfPoojaries(int noOfPoojaries) {
		this.noOfPoojaries = noOfPoojaries;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public String getMainGod() {
		return mainGod;
	}

	public void setMainGod(String mainGod) {
		this.mainGod = mainGod;
	}

	public boolean isKalyani() {
		return kalyani;
	}

	public void setKalyani(boolean kalyani) {
		this.kalyani = kalyani;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(obj instanceof TempleDTO){
			TempleDTO other =(TempleDTO) obj;
		if(this.name.equals(other.getName()));
		return true;
	}
		return false;
	 

	}



	
}


