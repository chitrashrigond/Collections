package com.xworkz.functional.dao;



import java.util.Collection;

import com.xworkz.functional.dto.MarketDTO;


public interface MarketDAO {

	boolean save(MarketDTO dto);

	MarketDTO find(MarketSearch search);

	Collection<MarketDTO> findAll(MarketSearch search);

}
