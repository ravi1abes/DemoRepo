package com.ak.array;

public class FindDuplicate {

	public static void findDuplicate(String[] strInput) {
		  for (int i = 0; i <= strInput.length-1; i++) {
			  for (int j = i+1; j < strInput.length; j++) {
				if((strInput[i].equals(strInput[j]))& (i!=j) ){
					System.out.println("Duplicate Array :- "+strInput[i]);
				}
			}
			
		}

	}

	public static void main(String[] args) {
		String[] strInput= {"Amit","Kumar","Singh","Amit","Kumar"};
		findDuplicate(strInput);

	}

}
