/**
* @author suren
 *
*/
package com.angularrest.webshop.model;

public class CD {
	private long id;
	private String name;
	private double price;

	CD() {
	}
	public CD(long id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CD [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	

}
