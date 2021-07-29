package com.xworkz.optional.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Optional;

import com.xworkz.optional.dto.RogiDTO;
import com.xworkz.optional.util.RogiSearch;

public class RogiDAOImpl implements RogiDAO {
	private Collection<RogiDTO> dto = new ArrayList<RogiDTO>();

	public RogiDAOImpl() {
		this.dto = dto;
	}

	
	/*@Override
	public Optional<RogiDTO> findOne() {
		Iterator<RogiDTO> itr = dto.iterator();
		return Optional.of(itr.next());
	}*/

	@Override
	public Optional<Integer> totalSize() {
		Integer age = null;
		return Optional.ofNullable(age);

	}

	@Override
	public Optional<RogiDTO> findByMaxAge() {
		Iterator<RogiDTO> itr = dto.iterator();
		// 21 34 55 44
		int maxAge = 0;
		RogiDTO rogiObj;
		RogiDTO maxAgeObj = null;
		while (itr.hasNext()) {
			rogiObj = itr.next();
			if (rogiObj.getAge() > maxAge) { // 34 > 21
				maxAge = rogiObj.getAge();
				maxAgeObj = rogiObj;
			}
		}
		return Optional.ofNullable(maxAgeObj);
	}

	@Override
	public Optional<RogiDTO> findByMinAge() {

		Iterator<RogiDTO> itr = dto.iterator();

		int minAge = 100;
		RogiDTO rogiObj;
		RogiDTO minAgeObj = null;
		while (itr.hasNext()) {
			rogiObj = itr.next();
			if (rogiObj.getAge() < minAge) { // 34 > 21
				minAge = rogiObj.getAge();
				minAgeObj = rogiObj;
			}
		}
		return Optional.ofNullable(minAgeObj);
	}

	@Override
	public Collection<RogiDTO> findAll() {
		// TODO Auto-generated method stub
		return this.dto;
	}


	@Override
	public void save(RogiDTO dto1) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Optional<RogiDTO> findOne() {
		// TODO Auto-generated method stub
		return null;
	}

}
