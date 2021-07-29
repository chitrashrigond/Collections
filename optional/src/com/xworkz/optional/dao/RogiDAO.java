package com.xworkz.optional.dao;

import java.util.Collection;
import java.util.Optional;

import com.xworkz.optional.dto.RogiDTO;
import com.xworkz.optional.util.RogiSearch;

public interface RogiDAO {
	
//Optional<RogiDTO> findOne();
Optional<Integer> totalSize();

Optional<RogiDTO> findByMaxAge();

Optional<RogiDTO> findByMinAge();
Collection<RogiDTO> findAll();
void save(RogiDTO dto1);
//Collection<RogiDTO> findAll(RogiSearch search);

Optional<RogiDTO> findOne();
}
