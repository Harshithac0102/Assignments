package com.sonata;

public class Car {
	int speed;
	double regularPrice;
	String color;
	public Car(int speed, double regularPrice, String color) {
		// TODO Auto-generated constructor stub
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}

	double getSalePrice() {
		return regularPrice;
	}
	


}
