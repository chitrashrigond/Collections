package com.xworkz.datastore.dto.dao;

import java.util.Collection;

import com.xworkz.datastore.dao.constant.HighwayType;

public interface HighwayDAO {
	
boolean save(HighwayDTO dto);

Collection<HighwayDTO>findAll();

Collection<Integer>findAllNumber();

int totalItems();

Collection<HighwayDTO>findByHighwayType(HighwayType type);

Collection<HighwayDTO>findByStateName(String sname);
Collection<HighwayDTO>findNumberByStateName(String sName);
boolean exist(HighwayDTO dto);
boolean isCondition(int number);

double findLengthByNumber(double no);
HighwayDTO findBYMaxLength();
HighwayDTO findBYMinLength();

}
