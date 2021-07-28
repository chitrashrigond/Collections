package com.xworkz.functional.dao;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.xworkz.functional.dto.HabbaDTO;
import com.xworkz.functional.dto.MarketDTO;

import com.xworkz.functional.constatnt.MarketType;

public class MarketDAOImpl implements MarketDAO {

	private List<MarketDTO> list = new ArrayList<MarketDTO>();

	@Override
	public boolean save(MarketDTO dto) {
		boolean added = list.add(dto);
		System.out.println(dto);
		return added;
	}

	@Override
	public MarketDTO find(MarketSearch search) {

	List<MarketDTO> dto =new ArrayList<MarketDTO>();
	this.list.forEach(c->{
		if(search.test(c)){
			dto.add(c);
		}
	});

	
		return dto.get(0);
	}

	@Override
	public Collection<MarketDTO> findAll(MarketSearch search) {
		Collection<MarketDTO> dto = new ArrayList<MarketDTO>();
		this.list.forEach(d->{
		if(search.test(d)){
			dto.add(d);
		}
			});
		
		return dto;
	}
	}


