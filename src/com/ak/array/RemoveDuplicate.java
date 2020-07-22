package com.ak.array;

import java.util.Arrays;

public class RemoveDuplicate {
	public static void removeDuplicate(int[] inputArray) {
		System.out.println("Arrays with Duplicate : "+Arrays.toString(inputArray));
		int noOfUniqueElements = inputArray.length;
		for (int i = 0; i < noOfUniqueElements; i++) {
			for (int j = i + 1; j < noOfUniqueElements; j++) {
				if (inputArray[i] == inputArray[j]) {
					inputArray[j] = inputArray[noOfUniqueElements - 1];
					noOfUniqueElements--;
					j--;
				}
			}
		}
		int[] arrayWithOutDuplicate = Arrays.copyOf(inputArray, noOfUniqueElements);
		System.out.println("Arrays without Duplicate : " + Arrays.toString(arrayWithOutDuplicate));
		System.out.println("==================================================");
	}

	public static void main(String[] args) {
            removeDuplicate(new int[] {2,3,4,6,7,8,2,3});
            
	}
}
