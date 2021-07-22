package com.xworkz.datastore.dto.dao;
import java.util.ArrayList;

import java.util.Collection;
import java.util.List;
import java.util.Iterator;
public  class TempleDAOImpl implements TempleDAO {
	 List<TempleDTO> list = new ArrayList<TempleDTO>();

	

	@Override
	public boolean save(TempleDTO dto) {
		boolean add = list.add(dto);
		System.out.println("dto *********" + dto);
		System.out.println("dto added  " + add);
		return add;
	}



	@Override
	public boolean delete(TempleDTO dto) {
		if (this.list.contains(dto)) {
			System.out.println("delete temple : " + dto);
			System.out.println("cant print "+dto);
		} else {
			System.out.println("temple not found cannot delete");
		}
		
		return false;
	}
	@Override
	public int totalItems() {
		int total = list.size();
		return total;
	}



	@Override
	public TempleDTO findFirstItem() {
		TempleDTO findFirstItem= list.get(0);
		return findFirstItem;
	}



	@Override
	public TempleDTO findLastItem() {
		TempleDTO findLastItem= list.get(list.size()-1);
		return findLastItem;
	}



	@Override
	public TempleDTO findByName(String name) {
		TempleDTO dto=null;
		Iterator<TempleDTO> itr =this.list.iterator();
		while(itr.hasNext()){
			TempleDTO temp=itr.next();
			if(temp.getName().equals(name)){
			dto=temp;
			System.out.println(temp);
			break;
			}
		}
		return dto;
	}



	@Override
	public TempleDTO findByLocation(String Location) {
		TempleDTO dto=null;
		Iterator<TempleDTO> itr=this.list.iterator();
		while(itr.hasNext()){
			TempleDTO temp=itr.next();
			if(temp.getLocation().equals(Location)){
			dto=temp;
			break;
			}
		}
		
		return dto;
	}



	@Override
	public TempleDTO findByLocationAndName(String Location, String name) {
		TempleDTO dto2=null;
		Iterator<TempleDTO> itr=this.list.iterator();
		while(itr.hasNext()){
			TempleDTO temp=itr.next();
			if((temp.getLocation().equals(Location)&&(temp.getName().equals(name)))){
			dto2=temp;
			break;
			}
		}
		
		return dto2;
	}



	@Override
	public Collection<TempleDTO> findAll() {
		// TODO Auto-generated method stub
		return list;
	}



	@Override
	public Collection<TempleDTO> findAllTempleBYLocationStartWith(char chara) {
		Collection<TempleDTO> tempCollection = new ArrayList<TempleDTO>();
		String string=Character.toString(chara);
		Iterator<TempleDTO> temp=this.list.iterator();
		while(temp.hasNext()){
			TempleDTO dto=temp.next();
			if(dto.getLocation().startsWith(string)){
				System.out.println("temple location**********************************"+dto);
				tempCollection.add(dto);
			}
		}
		return tempCollection;
	}



	@Override
	public Collection<TempleDTO> findAllTempleBYEntryFeesGreaterThan(double cost) {
		Collection<TempleDTO> tempCollection = new ArrayList<TempleDTO>();
		
		Iterator<TempleDTO> temp=this.list.iterator();
		while(temp.hasNext()){
			TempleDTO dto=temp.next();
			if(dto.getEntryFee()>cost){
				System.out.println("temple fees greater than 50  "+dto);
				tempCollection.add(dto);
			}
		}
		return tempCollection;
		
	}



	@Override
	public Collection<TempleDTO> findAllTempleBYNoOfPoojarisGreaterThan(int no) {
		Collection<TempleDTO> tempCollection = new ArrayList<TempleDTO>();
		Iterator<TempleDTO> temp=this.list.iterator();
		while(temp.hasNext()){
			TempleDTO dto=temp.next();
			if(dto.getNoOfPoojaries()>no){
				System.out.println("temple no of Poojaries"+dto);
				tempCollection.add(dto);
			}
		}
		return  tempCollection;
	}



	@Override
	public String findLocationByName(String name) {
		Iterator<TempleDTO> temp=this.list.iterator();
		while(temp.hasNext()){
			TempleDTO dto=temp.next();
			if(dto.getName().equals(name)){
				System.out.println("location"+dto.getLocation());
				
			}
		}
		return  name;
		
	}



	@Override
	public Collection<String> findAllLocation() {
		
		Collection<String> temCollection=new ArrayList<String>();
		Iterator<TempleDTO> temple=this.list.iterator();
		while(temple.hasNext()){
			TempleDTO dto=temple.next();
			
				System.out.println("location"+dto.getLocation());
				temCollection.add(dto.getLocation());
			
		}
		return temCollection;
	
	}





	
	
	
	
	
	
	
	
}	


