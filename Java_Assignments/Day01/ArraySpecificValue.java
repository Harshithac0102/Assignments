package com.sonata;

public class ArraySpecificValue {

	public static void main(String[] args) {
		int[] num = {6, 12, 23, 54, 5};
	    int toFind = 30;
	    boolean found = false;

	    for (int n : num) {
	      if (n == toFind) {
	        found = true;
	        break;
	      }
	    }
	    
	    if(found)
	      System.out.println(toFind + " is found.");
	    else
	      System.out.println(toFind + " is not found.");

	}

}
