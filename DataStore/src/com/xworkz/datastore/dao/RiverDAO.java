package com.xworkz.datastore.dao;


	public interface RiverDAO {

		boolean save(RiverDTO dto);

		int totalItems();

		void update(RiverDTO dto);

		boolean delete(RiverDTO dto);

	}

