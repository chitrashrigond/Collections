package com.xworkz.datastore.dto.dao;
import java.io.Serializable;

import com.xworkz.datastore.dao.constant.HighwayType;
public class HighwayDTO implements Serializable{
private int id;
private int number;
private HighwayType type;
private String stateName;
private double length;
private boolean condition;
private String contractCompany;

public HighwayDTO() {
	super();
	// TODO Auto-generated constructor stub
}
public HighwayDTO(int id, int number, HighwayType type, String stateName, double length, boolean condition,
		String contractCompany) {
	super();
	this.id = id;
	this.number = number;
	this.type = type;
	this.stateName = stateName;
	this.length = length;
	this.condition = condition;
	this.contractCompany = contractCompany;
}
@Override
public String toString() {
	return "HighwayDTO [id=" + id + ", number=" + number + ", type=" + type + ", stateName=" + stateName + ", length="
			+ length + ", condition=" + condition + ", contractCompany=" + contractCompany + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public HighwayType getType() {
	return type;
}
public void setType(HighwayType type) {
	this.type = type;
}
public String getStateName() {
	return stateName;
}
public void setStateName(String stateName) {
	this.stateName = stateName;
}
public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
}
public boolean isCondition() {
	return condition;
}
public void setCondition(boolean condition) {
	this.condition = condition;
}
public String getContractCompany() {
	return contractCompany;
}
public void setContractCompany(String contractCompany) {
	this.contractCompany = contractCompany;
}
public void save(HighwayDTO dto1) {
	// TODO Auto-generated method stub
	
}


}
