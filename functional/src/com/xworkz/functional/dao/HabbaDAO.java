package com.xworkz.functional.dao;



import java.util.Collection;

import com.xworkz.functional.dto.HabbaDTO;
import com.xworkz.functional.dto.MarketDTO;


public interface HabbaDAO {

	boolean ulisu(HabbaDTO dto);

	HabbaDTO ondanuHuduku(HabbaSearch search);

	Collection<HabbaDTO> elladannaHuduku(HabbaSearch search);

}
