package com.xworkz.datastore.dto.dao;
import com.xworkz.datastore.dao.constant.HighwayType;
import com.xworkz.datastore.dto.dao.HighwayDAO;
import com.xworkz.datastore.dto.dao.HighwayDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
public class HighwayDAOImpl implements HighwayDAO{

	private List<HighwayDTO> list = new ArrayList<HighwayDTO>();
	@Override
	public boolean save(HighwayDTO dto) {
		boolean add = list.add(dto);
		System.out.println("dto *********" + dto);
		System.out.println("dto added  " + add);
		return add;
		
	}

	@Override
	public Collection<HighwayDTO> findAll() {
	
		return list;
	}

	@Override
	public Collection<Integer> findAllNumber() {
		 
		Collection<Integer> highCollection=new ArrayList<Integer>();
		Iterator<HighwayDTO> highway=this.list.iterator();
		while(highway.hasNext()){
			HighwayDTO dto=highway.next();
			
				System.out.println("location"+dto.getNumber());
				highCollection.add(dto.getNumber());
			
		}
		return highCollection;
		
	}

	@Override
	public int totalItems() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<HighwayDTO> findByHighwayType(HighwayType type) {
		Collection<HighwayDTO> hCollection = new ArrayList<HighwayDTO>();
		
		Iterator<HighwayDTO> temp=this.list.iterator();
		while(temp.hasNext()){
			HighwayDTO dto=temp.next();
			if(dto.getType().equals(type)){
				//System.out.println("Highway Type  "+dto);
				hCollection.add(dto);
			}
		}
		return hCollection;
		
			
	
	}

	@Override
	public Collection<HighwayDTO> findByStateName(String sname) {
Collection<HighwayDTO> hCollection = new ArrayList<HighwayDTO>();
		
		Iterator<HighwayDTO> temp=this.list.iterator();
		while(temp.hasNext()){
			HighwayDTO dto=temp.next();
			if(dto.getStateName().equals(sname)){
				//System.out.println("Highway Type  "+dto);
				hCollection.add(dto);
			}
		}
		return hCollection;
		
	}

	@Override
	public Collection<HighwayDTO> findNumberByStateName(String sName) {
		Collection<HighwayDTO> hCollection = new ArrayList<HighwayDTO>();
		Iterator<HighwayDTO> itr=this.list.iterator();
		while(itr.hasNext()){
			HighwayDTO dto=itr.next();
			if(dto.getStateName().equals(sName)){
				
				hCollection.add(dto);
			}
		}
		return  hCollection;
		
		
	}

	@Override
	public boolean exist(HighwayDTO dto) {
		boolean exist=this.list.contains(dto);
		
		return exist;
	}

	@Override
	public boolean isCondition(int number) {
		boolean condition=false;
		Iterator<HighwayDTO> itr=this.list.iterator();
		while(itr.hasNext()){
			HighwayDTO dto=itr.next();
			if(dto.getNumber()==number){
				//System.out.println("Highway Type  "+dto);
				
			}
		}
		return condition;
	}

	@Override
	public double findLengthByNumber(double no) {
		Iterator<HighwayDTO> itr=this.list.iterator();
		double length=0;
		while(itr.hasNext()){
			HighwayDTO dto=itr.next();
			if(dto.getNumber()==(no)){
				
				
			}
		}
		return length;
	}

	@Override
	public HighwayDTO findBYMaxLength() {
		HighwayDTO maxLength=null;
		maxLength=Collections.max(list,null);
				
		return maxLength;
	}

	@Override
	public HighwayDTO findBYMinLength() {
		HighwayDTO minLength=null;
		minLength=Collections.min(list,null);
		return minLength;
	}


	
}
