package com.xworkz.datastore.unique;

import java.util.Comparator;

public class KitchenItemNameComparator implements Comparator<KitchenItemDTO> {

	

		@Override
		public int compare(KitchenItemDTO o1, KitchenItemDTO o2) {
			
			return o1.getName().compareTo(o2.getName());
		}
	}


