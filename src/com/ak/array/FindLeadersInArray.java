package com.ak.array;

import java.util.Arrays;

public class FindLeadersInArray {
	
	public static void findTheLeaders(int[] inputArray) {

		// int inputArrayLenght = inputArray.length;
		int max = inputArray[inputArray.length - 1];
		System.out.println("Leaders in Array : " + Arrays.toString(inputArray) + " are : ");
		System.out.println(inputArray[inputArray.length - 1]);

		for (int i = inputArray.length - 2; i >= 0; i--) {
			if (inputArray[i] > max) {
				System.out.println(inputArray[i]);
				max = inputArray[i];
			}
		}
		System.out.println("===================================================");
	}

	public static void main(String[] args) {
        findTheLeaders(new int[] {15,12,9,7,14,8,6,3});   
	}
}
