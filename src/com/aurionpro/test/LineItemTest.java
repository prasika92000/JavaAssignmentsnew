package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.aurionpro.model.Customer;
import com.aurionpro.model.LineItem;
import com.aurionpro.model.Order;
import com.aurionpro.model.Product;

public class LineItemTest {

	public static void main(String[] args) {
		    Product product1 = new Product(2, "Laptop ",45000.75, 30);
		    Product product2 = new Product(3, "Airpods ", 25000.50, 20);
		    Product product3 = new Product(4, "Smart Watch", 3000, 5);
		    LineItem lineItem1 = new LineItem(2, 50, product1);
	        LineItem lineItem2 = new LineItem(3, 100, product2);
	        LineItem lineItem3 = new LineItem(4, 35, product3);
	        
	    	List<LineItem> lineItem=new ArrayList<>();
			lineItem.add(lineItem1);
	        lineItem.add(lineItem2);
	        lineItem.add(lineItem3);
	        for (LineItem x : lineItem) {
	            System.out.println(lineItem);
	            System.out.println("Line Item Cost: " + x.calculateLineItemPrice());
	            System.out.println();
	        }
	        

	        Order order = new Order(1, new Date(),(lineItem)); 
		    Customer customer = new Customer(1, "Rasika", Arrays.asList(order));
		   
		    
		   // System.out.println("Discounted Price: " + product.calculateDiscountedPrice());
	        System.out.println("Line Item Cost: " + ((LineItem) lineItem).calculateLineItemPrice());      
	        System.out.println("Order Price: " + order.calculateOrderPrice());
	
		   
		  }

	}

//localdate ...LocalDate.now()
