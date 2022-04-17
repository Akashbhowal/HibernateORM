package com.akash.hibernateOrm.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class shop {
	@Id
	private int id;
	private String item;
	private double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
