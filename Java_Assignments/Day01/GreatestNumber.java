package com.sonata;


public class GreatestNumber {

	public static void main(String[] args) {
		 int num1 =12, num2 = 25, num3=89;
		   
		   
		  if (num1 > num2)
		   if (num1 > num3)
		    System.out.println("The greatest: " + num1);
		   
		  if (num2 > num1)
		   if (num2 > num3)
		    System.out.println("The greatest: " + num2);
		   
		  if (num3 > num1)
		   if (num3 > num2)
		    System.out.println("The greatest: " + num3);

	}

}
