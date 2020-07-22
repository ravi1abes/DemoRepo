
package com.ak.array;

import java.util.Arrays;

public class SeperateZero {
	public static void moveZeroToEnd(int[] intArray) {
		System.out.println("Input Array : " + Arrays.toString(intArray));
		int counter = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] != 0) {
				intArray[counter] = intArray[i];
				counter++;
			}
		}
		while (counter < intArray.length) {
			intArray[counter] = 0;
			counter++;
		}
		System.out.println("Input Array After moving zero to end");
		System.out.println(Arrays.toString(intArray));
		System.out.println("===================================");

	}

	public static void moveZeroToFront(int[] inputArray) {
		System.out.println("Input Array : " + Arrays.toString(inputArray));
		int counter = inputArray.length - 1;
		for (int i = inputArray.length-1; i >=0; i--) {
			if (inputArray[i] != 0) {
				inputArray[counter] = inputArray[i];
				counter--;
			}
		}
		while (counter >= 0) {
			inputArray[counter] = 0;
			counter--;
		}
		System.out.println("Input Array After Moving Zeros To The Front :");
		System.out.println(Arrays.toString(inputArray));
		System.out.println("====================================");
	}

	public static void main(String[] args) {
		moveZeroToEnd(new int[] { 2, 4, 5, 0, 9, 0, 8, 0, 3 });
		moveZeroToFront(new int[] { 2, 4, 5, 0, 9, 0, 8, 0, 3 });
	}

}
