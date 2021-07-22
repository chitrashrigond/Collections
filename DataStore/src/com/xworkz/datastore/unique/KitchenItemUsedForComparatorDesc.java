package com.xworkz.datastore.unique;

import java.util.Comparator;

public class KitchenItemUsedForComparatorDesc implements Comparator<KitchenItemDTO> {

	

	@Override
	public int compare(KitchenItemDTO o1, KitchenItemDTO o2) {
		return o1.getUsedFor().compareTo(o2.getUsedFor()); 
	}

}
