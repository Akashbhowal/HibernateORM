package com.akash.hibernateOrm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.akash.hibernateOrm.dao.Shopdao;
import com.akash.hibernateOrm.dto.shop;

public class test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/akash/hibernateOrm/config.xml");
		Shopdao simp = (Shopdao) ctx.getBean("daoImpl");
		shop sp = new shop();

		System.out.println("Inserting");
		sp.setId(452);
		sp.setItem("Almirah");
		sp.setPrice(56000);
		System.out.println(simp.create(sp));

		System.out.println("Updating");
		sp.setId(123);
		sp.setItem("Iphone 13 pro");
		sp.setPrice(120000);
		simp.update(sp);

		System.out.println("deleting");
		sp.setId(314);
		simp.delete(sp);

		System.out.println("find by id");
		shop po = simp.find(123);
		System.out.println(po.getId() + " " + po.getItem() + "  " + po.getPrice());

		System.out.println("Finding all....");
		java.util.List<shop> ho = simp.findAll();
		for (shop op : ho) {
			System.out.println(op.getId() + "  " + op.getItem() + " " + op.getPrice());
		}
		
		((AbstractApplicationContext) ctx).close();
	}

}
