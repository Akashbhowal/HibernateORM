package com.akash.hibernateOrm.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.akash.hibernateOrm.dao.Shopdao;
import com.akash.hibernateOrm.dto.shop;

@Component("daoImpl")
public class ShopDaoImpl implements Shopdao {

	@Autowired
	HibernateTemplate ht;

	@Transactional
	@Override
	public int create(shop sp) {
		int x = (int) ht.save(sp);
		return x;
	}

	@Transactional
	@Override
	public void update(shop sp) {
		ht.update(sp);
	}

	@Transactional
	@Override
	public void delete(shop sp) {
		ht.delete(sp);
	}

	@Transactional
	@Override
	public shop find(int id) {
		shop po = ht.get(shop.class, id);
		return po;
	}

	@Transactional
	@Override
	public List<shop> findAll() {
		List<shop> po = ht.loadAll(shop.class);
		return po;
	}

}
