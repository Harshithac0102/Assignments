package com.sonata;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan sedan = new Sedan(250, 2500, "red", 200);
		System.out.println("Sale price of sedan is: "+ sedan.getSalePrice());
		System.out.println();		
		Ford ford1 = new Ford(220,3000,"black",2008,10);
		System.out.println("Sale Price of old model of ford is: " + ford1.getSalePrice());
		System.out.println();
		Ford ford2 = new Ford(220,3500,"green",2010,5);
		System.out.println("Sale Price of new model of ford is: " + ford2.getSalePrice());
		System.out.println();
		Car car = new Car(200,2000,"gray");
		System.out.println("Generally prices of car is around: " + car.getSalePrice());
	}

}
