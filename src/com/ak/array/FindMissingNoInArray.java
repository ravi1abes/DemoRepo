package com.ak.array;

public class FindMissingNoInArray {
	public static int sumOfNumbers(int n) {
		int sum = (n * (n + 1)) / 2;
		return sum;
	}
	
	public static int sumOfElements(int[] inputArray) {
		int sum=0;
		for (int i = 0; i < inputArray.length; i++) {
			sum=sum+inputArray[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] inputArray= {1,4,5,3,2,8,6};
		int n=8;
		
		int SumOfNum=sumOfNumbers(n);
		int SumOfElem=sumOfElements(inputArray);
		
		int missingNo=SumOfNum-SumOfElem;
		System.out.println("Missing No : "+missingNo);
		
	}
}
