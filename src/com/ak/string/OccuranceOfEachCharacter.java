package com.ak.string;

import java.util.HashMap;

public class OccuranceOfEachCharacter {

	public static void findOccuranceOfEachCharInString(String inputString) {
		
		HashMap<Character, Integer> mapCount = new HashMap<Character, Integer>();
		char[] chArray = inputString.toCharArray();
		for (char ch : chArray) {
			if (mapCount.containsKey(ch)) {
				mapCount.put(ch, mapCount.get(ch) + 1);
			} else {
				mapCount.put(ch, 1);
			}
		}

		System.out.println("InputString : " + inputString + "Count : " + mapCount);
	}
	public static void main(String[] args) {
		findOccuranceOfEachCharInString("AmitKumarSingh");
	}
}
