package com.xworkz.functional.dao;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.xworkz.functional.dto.HabbaDTO;
import com.xworkz.functional.dto.MarketDTO;


public class HabbaDAOImpl implements HabbaDAO {

	private List<HabbaDTO> list = new ArrayList<HabbaDTO>();

	@Override
	public boolean ulisu(HabbaDTO dto) {
		boolean added = list.add(dto);
		System.out.println(dto);
		return added;
	}

	@Override
	public HabbaDTO ondanuHuduku(HabbaSearch search) {
		List<HabbaDTO> dto = new ArrayList<HabbaDTO>();
	this.list.forEach(d->{
		if (search.test(d)) {
			dto.add(d);

		}
		
	});
				return dto.get(0);
	}

	@Override
	public Collection<HabbaDTO> elladannaHuduku(HabbaSearch search) {
		Collection<HabbaDTO> dto = new ArrayList<HabbaDTO>();
		this.list.forEach(d->{
		if(search.test(d)){
			dto.add(d);
		}
			});
		
		return dto;
	}

}
