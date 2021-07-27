package com.xworkz.functional.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.xworkz.functional.dto.HabbaDTO;
import com.xworkz.functional.dto.MarketDTO;
import com.xworkz.market.util.HabbaSearch;
import com.xworkz.market.util.MarketSearch;

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

		Iterator<HabbaDTO> itr = this.list.iterator();
		HabbaDTO temp = null;
		while (itr.hasNext()) {
			HabbaDTO habbaDTO = itr.next();
			if (search.test(habbaDTO)) {
				temp = habbaDTO;

			}
		}
		return temp;
	}

	@Override
	public Collection<HabbaDTO> elladannaHuduku(HabbaSearch search) {
		Collection<HabbaDTO> dto = new ArrayList<HabbaDTO>();
		Iterator<HabbaDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			HabbaDTO habbaDTO = itr.next();
			if (search.test(habbaDTO)) {
				dto.add(habbaDTO);

			}
		}
		return dto;
	}

}
