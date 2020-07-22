package com.ak.array;

import java.util.Arrays;

public class FindSecondLargest {

	public static void findSecondLargest(int[] intputArray) {
		int firstLargest, secondLargest ,temp;
		if (intputArray[0] > intputArray[1]) {
			firstLargest = intputArray[0];
			secondLargest = intputArray[1];
		} else {
			firstLargest = intputArray[1];
			secondLargest = intputArray[0];
		}
		for (int i = 2; i < intputArray.length-1; i++) {
             if(intputArray[i]>firstLargest) {
            	 secondLargest=firstLargest;
            	 firstLargest=intputArray[i];			 
             }else if(intputArray[i]<firstLargest&intputArray[i]>secondLargest){
            	 secondLargest=intputArray[i];
             }
		}

		System.out.println("Input Array :");
		System.out.println(Arrays.toString(intputArray));
		System.out.println("Second Largest Element : ");
		System.out.println(secondLargest);

	}

	public static void main(String[] args) {
		int[] intArray = { 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 5, 4 };
		findSecondLargest(intArray);
	}
}
