package com.aurionpro.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Order {
	private int id;
	private Date date;
	private List<LineItem>items;
	
	public Order(int id, Date date, List<LineItem> items) {
		super();
		this.id = id;
		this.date = date;
		this.items = items;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<LineItem> getItems() {
		return items;
	}

	public void setItems(List<LineItem> items) {
		this.items = items;
	}
	
	 public double calculateOrderPrice() {
		    double orderPrice = 0;
		    for (LineItem lineItem : items) {
		      orderPrice += lineItem.calculateLineItemPrice();
		    }
		    return orderPrice;
		  }

	@Override
	public String toString() {
		return "Order [id=" + id + ", date=" + date + ", items=" + items + "]";
	}
	 
	 
	
	
	
	
	

}
