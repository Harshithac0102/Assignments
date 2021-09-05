package com.sonata;

public class MaxRepeatingDuplicates {
	 public void MaxRepeatingDuplicatesInPlace(int [] arrA){
		 int size = arrA.length;
		 int maxCount=0;
		 int maxIndex=0;
		 for (int i = 0; i <size ; i++) {
		 //get the index to be updated
		 int index = arrA[i]% size;
		 arrA[index] = arrA[index] + size;
		 }
		 for (int i = 0; i <size ; i++) {
		 if(arrA[i]/size>maxCount){
		 maxCount=arrA[i]/size;
		 maxIndex=i;
		 }
		 }
		 System.out.println("Element repeating maximum no of times: " + maxIndex + ", maximum count: " + maxCount);
		 }
		 public static void main(String[] args) {
		 int [] arrA = {4, 1, 5, 2, 1, 5, 9, 8, 6, 5, 3, 2, 4, 7};
		 MaxRepeatingDuplicates m = new MaxRepeatingDuplicates();
		 m.MaxRepeatingDuplicatesInPlace(arrA);
		 }
}
