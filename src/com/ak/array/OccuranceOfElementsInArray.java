package com.ak.array;

public class OccuranceOfElementsInArray {

	public static void findOccuranceOfEachElements(int[] inputArray) {
		int[] fr = new int[inputArray.length];
		int visited = -1;
		for (int i = 0; i < inputArray.length; i++) {
			int count = 1;
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] == inputArray[j]) {
					count++;
					fr[j] = visited;
				}
			}

			if (fr[i] != visited) {
				fr[i] = count;
			}
		}
		// Displays the frequency of each element present in array
		System.out.println("---------------------------------------");
		System.out.println(" Element | Frequency");
		System.out.println("---------------------------------------");
		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != visited)
				System.out.println("    " + inputArray[i] + "    |    " + fr[i]);
		}
		System.out.println("----------------------------------------");
	}

	public static void main(String[] args) {
         findOccuranceOfEachElements(new int[] {2,3,4,5,6,7,8,0,4,3,3,2,2,2,8});
	}
}
