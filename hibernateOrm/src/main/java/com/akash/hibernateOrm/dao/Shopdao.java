package com.akash.hibernateOrm.dao;

import java.util.List;

import com.akash.hibernateOrm.dto.shop;


public interface Shopdao {
		public int create(shop sp);
		
		public void update(shop sp);
		
		public void delete(shop sp);
		
		public shop find(int id);
		
		public List<shop> findAll();
}
