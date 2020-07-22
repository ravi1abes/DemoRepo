package com.ak.array;

import java.util.Arrays;

public class ArraySort {
	public static void sortArray(int[] inputArray) {
		System.out.println("Input Array : " + Arrays.toString(inputArray));
		int temp;
		for (int i = 0; i < inputArray.length - 1; i++) {
			for (int j = 0; j < inputArray.length -1; j++) {
				if (inputArray[j] > inputArray[j + 1]) {
					temp = inputArray[j];
					inputArray[j] = inputArray[j + 1];
					inputArray[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted Array : " + Arrays.toString(inputArray));
	}

	public static void main(String[] args) {
		sortArray(new int[] { 4, 5, 6, 7, 8, 9, 5, 4, 3, 2, 1 });
	}
}
