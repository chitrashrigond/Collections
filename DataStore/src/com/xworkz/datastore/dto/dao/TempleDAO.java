package com.xworkz.datastore.dto.dao;

import java.util.Collection;

import com.xworkz.datastore.dao.RiverDTO;

public interface TempleDAO {

	boolean save(TempleDTO dto);

	boolean delete(TempleDTO dto);

	int totalItems();

	TempleDTO findFirstItem();

	TempleDTO findLastItem();

	TempleDTO findByName(String name);

	TempleDTO findByLocation(String Location);

	TempleDTO findByLocationAndName(String name,String Location);
	
	Collection<TempleDTO> findAll();
	
	Collection<TempleDTO> findAllTempleBYLocationStartWith(char chara);
	
	Collection<TempleDTO> findAllTempleBYEntryFeesGreaterThan(double cost);
	
	Collection<TempleDTO> findAllTempleBYNoOfPoojarisGreaterThan(int no);
	
	String findLocationByName(String name);
	
	Collection<String> findAllLocation();


}
