package com.sonata;

public class Product {

	 int prodId;
	    String prodName;
	    double prodPrice;


	public void display() {
		System.out.println(" Product id is: "+prodId+"\n Product name is :"+prodName+"\n Product price is :"+prodPrice+"\n Product price with GST :"+(prodPrice+(prodPrice/100)*18));
	    
	}

	    public static void main(String[] args) {
	        Product product = new Product();
	        product.prodId=1;
	        product.prodName="Shirt";
	        product.prodPrice=100.00;
	        product.display();
	        Product product1 = new Product();
	        product1.prodId=2;
	        product1.prodName="Jeans";
	        product1.prodPrice=500.00;
	        product1.display();
	        
	    }

}
