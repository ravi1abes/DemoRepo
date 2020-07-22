package com.ak.array;

import java.util.Arrays;

public class EqaualityCheckOfArray {
	public static void main(String[] args) {
		int[] array1 = { 23, 4, 5, 67, 89 };
		int[] array2 = { 23, 4, 5, 67, 89,78 };
		boolean equalOrNot = true;
		if (array1.length == array2.length) {
			for (int i = 0; i < array1.length; i++) {
				if (array1[i] != array2[i]) {
					equalOrNot = false;
				}
			}
		} else {
			equalOrNot = false;
		}
		System.out.println("Input Arrays :");
		System.out.println("First Array : " + Arrays.toString(array1));
		System.out.println("Second Array : " + Arrays.toString(array2));
		if (equalOrNot) {
			System.out.println("Two Arrays Are Equal");
		} else {
			System.out.println("Two Arrays Are Not equal");
		}
	}

}
