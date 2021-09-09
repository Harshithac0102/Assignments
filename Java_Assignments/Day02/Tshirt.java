package com.sonata;

public class Tshirt {
	String color ;
	String material ;
	String design ;
	
	public void display() {
		System.out.println(" color is:"+color+"\n material is:"+material+"\n design is:"+design);
	}
	
	
	public static void main(String[] args) {
		Tshirt small = new Tshirt();
		small.color = "Pink";
		small.material = "Cotton";
		small.design = "Round neck";
		small.display();
		Tshirt large = new Tshirt();
	    large.color = "Blue";
	    large.material = "Nylon";
	    large.design ="V-neck";
	    large.display();
	    Tshirt xtralarge = new Tshirt();
	    xtralarge.color ="yellow";
	    xtralarge.material = "Cotton";
	    xtralarge.design = "Round neck";
	    xtralarge.display();
		
		
	}

}
