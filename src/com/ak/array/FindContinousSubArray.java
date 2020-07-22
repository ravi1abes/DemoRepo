package com.ak.array;

import java.util.Arrays;

public class FindContinousSubArray {

	public static void findSubArray(int[] inputArray, int number) {

		for (int i = 0; i < inputArray.length; i++) {
			int sum =inputArray[i];

			for (int j = i+1; j < inputArray.length; j++) {
				sum = sum + inputArray[j];
				
                if(sum==number) {
                	 System.out.println("Input Array : "+Arrays.toString(inputArray));
                     System.out.println("Input Number : "+number);                    
                     System.out.print("Continuous Sub Array : ");     
                     for (int k= i; k <= j;k++)
                     {
                         System.out.print(inputArray[k]+" ");
                     }
                     System.out.println();
                 }
                }
			}
		}

	

	public static void main(String[] args) {
		findSubArray(new int[] { 42, 15, 12, 8, 6, 32 }, 26);
	}
}
