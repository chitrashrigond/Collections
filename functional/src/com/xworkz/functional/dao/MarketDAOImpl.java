package com.xworkz.functional.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.xworkz.functional.dto.MarketDTO;
import com.xworkz.functional.constatnt.MarketType;
import com.xworkz.market.util.MarketSearch;

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

		Iterator<MarketDTO> itr = this.list.iterator();
		MarketDTO temp = null;
		while (itr.hasNext()) {
			MarketDTO marketDTO = itr.next();
			if (search.test(marketDTO)) {
				temp = marketDTO;

			}
		}
		return temp;
	}

	@Override
	public Collection<MarketDTO> findAll(MarketSearch search) {
		Collection<MarketDTO> dto = new ArrayList<MarketDTO>();
		Iterator<MarketDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			MarketDTO marketDTO = itr.next();
			if (search.test(marketDTO)) {
				dto.add(marketDTO);

			}
		}
		return dto;
	}

}
