package com.ak.string;

public class CountNoOfWords {
	public static void findWordsCount(String inputString) {
		int count = 1;
		for (int i = 0; i < inputString.length() - 1; i++) {
			if ((inputString.charAt(i) == ' ') && (inputString.charAt(i + 1) != ' ')) {
				count++;
			}		
		}
		System.out.println("Number words in String : " + count);
	}

	public static void main(String[] args) {
          findWordsCount("Amit Kumar Singh");
	}
}
