package com.sonata;

public class SumOfArray {

	public static void main(String[] args) {
		int array[] = {1, 2, 3, 4, 5,6};
	      int sum = 0;
	      //loop to calculate sum of array
	      for( int num : array) {
	          sum = sum+num;
	      }
	      System.out.println("Sum of array elements is:"+sum);

	}

}
