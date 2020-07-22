package com.ak.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FindMostFrequentElement {

	public static void findElementRepeatedElement(int[] inputArray) {
		int maxCounter = 0;
		int element = 0;

		for (int i = 0; i < inputArray.length; i++) {
			int count = 1;
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] == inputArray[j]) {
					count++;
				}
			}
			if (maxCounter < count) {
				maxCounter = count;
				element = inputArray[i];
			}

		}
		System.out.println("Element repeating maximum no of times: " + element + ", maximum count: " + maxCounter);
	}

	public static void getMaxRepeated(int[] inputArray) {
		HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		for (int i : inputArray) {
			if (countMap.containsKey(i)) {
				countMap.put(i, countMap.get(i) + 1);
			} else {
				countMap.put(i, 1);
			}
		}
		int element = 0;
		int frequency = 1;
		Set<Entry<Integer, Integer>> entrySet = countMap.entrySet();

		for (Entry<Integer, Integer> entry : entrySet) {
			if (entry.getValue() > frequency) {
				element = entry.getKey();
				frequency = entry.getValue();
			}
		}
		if (frequency > 1) {
			System.out.println("Input Array : " + Arrays.toString(inputArray));

			System.out.println("The most frequent element : " + element);

			System.out.println("Its frequency : " + frequency);

			System.out.println("========================");
		} else {
			System.out.println("Input Array : " + Arrays.toString(inputArray));

			System.out.println("No frequent element. All elements are unique.");

			System.out.println("=========================");
		}

	}

	public static void main(String[] args) {
		findElementRepeatedElement(new int[] { 2, 3, 4, 5, 6, 2, 7, 4, 3, 2 });
		getMaxRepeated(new int[] {45,5,6,67,89,0,56,89});
	}

}
