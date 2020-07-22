package com.ak.array;

import java.util.Arrays;

public class FindThePair {
	
	public static void findThePairOfElements(int[] inputArray, int number) {
		System.out.println("Input Array  : "+Arrays.toString(inputArray));
		System.out.println("Input Number : "+number);
		System.out.println("Pair of elements whose sum is : "+number+" are : ");
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i+1; j < inputArray.length; j++) {
				if(inputArray[i]+inputArray[j]==number) {
					System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+number);
				}
			}
		}
		System.out.println("=======================================");
	}

	public static void main(String[] args) {
	   findThePairOfElements(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);

	}

}
