package com.xworkz.datastore.unique;

import java.util.Collection;

public interface KitchenItemDAO {
	
boolean saveUnique(KitchenItemDTO dto);

Collection<KitchenItemDTO> findAllSortByUsedFor();


Collection<KitchenItemDTO> findAllSortByUsedForDesc();



Collection<KitchenItemDTO> findAllSortByName();

Collection<KitchenItemDTO> findAllSortByPriceDesc();






}
