package com.ak.array;

import java.util.Arrays;

public class ArrayReverse {
	public static void reverseArray(int[] inputArray) {
		System.out.println("Array Before Reverse : " + Arrays.toString(inputArray));
		int temp;
		for (int i = 0; i < inputArray.length / 2; i++) {
			temp = inputArray[i];
			inputArray[i] = inputArray[inputArray.length - 1 - i];
			inputArray[inputArray.length - 1 - i] = temp;
		}
		System.out.println("Array After Reverse : " + Arrays.toString(inputArray));
		System.out.println("====================================================");
	}

	public static void main(String[] args) {
          reverseArray(new int[] {3,4,5,6,9,0,1,23});
	}
}
