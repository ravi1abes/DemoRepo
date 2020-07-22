package com.ak.array;

import java.util.Arrays;

public class SubarrayGivenSumBruteforce {

	public static int[] findSubarray(int[] inputArray, int sum) {
		for (int i = 0; i < inputArray.length; i++) {

			int currentSum =0;

			for (int j = i; j <= inputArray.length; j++) {

				currentSum += inputArray[j];
				if (currentSum == sum) {
					return Arrays.copyOfRange(inputArray, i, j);
				} else if (currentSum > sum || j == inputArray.length) {
					break;
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int[] A = { 42, 5, 12, 8, 6, 32 };
		System.out.println(Arrays.toString(findSubarray(A, 26)));
	}
}
