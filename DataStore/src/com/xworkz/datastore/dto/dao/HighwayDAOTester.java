package com.xworkz.datastore.dto.dao;
import com.xworkz.datastore.dto.dao.HighwayDTO;
import java.util.ArrayList;
import java.util.Collection;

import com.sun.org.apache.bcel.internal.generic.DALOAD;
import com.xworkz.datastore.dao.constant.HighwayType;

public class HighwayDAOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HighwayDTO dto1=new HighwayDTO(1,45,HighwayType.DH,"kARNATAKA",562.32D,true,"AAAA");
HighwayDTO dto2=new HighwayDTO(6,54,HighwayType.MDR,"Kerala",402.32D,true,"BBBB");
HighwayDTO dto3=new HighwayDTO(8,57,HighwayType.VR,"TamilNadu",200.32D,false,"CCCC");
HighwayDTO dto4=new HighwayDTO(9,66,HighwayType.NH,"kARNATAKA",1534.32D,true,"DDDD");
	
	HighwayDAO dao = new HighwayDAOImpl();
	dao.save(dto1);
	dao.save(dto2);
	dao.save(dto3);
	dao.save(dto4);
	
	System.out.println("Total no of items   "+dao.totalItems());
	
	Collection<HighwayDTO> all = dao.findAll();
	System.out.println(all);
	
	Collection<Integer> allNumber =dao.findAllNumber();
	for(Integer all1: allNumber){
		System.out.println("All Number "+all1);
		}
	
	Collection<HighwayDTO>findByHighwayType=dao.findByHighwayType(HighwayType.VR);
	for(HighwayDTO temp:findByHighwayType){
		
	System.out.println("by highway type "+temp);
	}
	Collection<HighwayDTO>findByStateName=dao.findByStateName("kARNATAKA");
	for(HighwayDTO high:findByStateName){
		
	System.out.println("by State name "+high);
	}
	
	Collection<HighwayDTO>findNumberByStateName=dao.findNumberByStateName("Kerala");
	for(HighwayDTO high:findByStateName){
		
	System.out.println("number by State name "+high);
	}
	
	

	boolean dto=dao.exist(dto4);
	System.out.println("exist "+dto);
	
	boolean condition=dao.isCondition(9);
	System.out.println("condition "+condition);
	
	double length=dao.findLengthByNumber(402.32);
	System.out.println("length "+length);
	
	HighwayDTO maxlength=dao.findBYMinLength();
	System.out.println("min length "+dao);
	
	HighwayDTO minlength=dao.findBYMinLength();
	System.out.println("min length "+dao);
	
	
	
	
	}
}

