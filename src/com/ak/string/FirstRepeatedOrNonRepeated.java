package com.ak.string;

import java.util.HashMap;

public class FirstRepeatedOrNonRepeated {

	public static void findFirstRepeatedOrNonRepeated(String inputString) {
		HashMap<Character, Integer> mapCount = new HashMap<Character, Integer>();
		char[] charArray = inputString.toCharArray();
		for (char ch : charArray) {
			if (mapCount.containsKey(ch)) {
				mapCount.put(ch, mapCount.get(ch) + 1);
			} else {
				mapCount.put(ch, 1);
			}
		}
		for (char c : charArray) {
			if (mapCount.get(c) == 1) {
				System.out.println("First Non Repeated Array : " + c);
				break;
			}
		}
		for (char c : charArray) {
			if (mapCount.get(c) > 1) {
				System.out.println("First Reparted Array : " + c);
				break;
			}
		}
	}

	public static void main(String[] args) {
		findFirstRepeatedOrNonRepeated(new String("amitkumar"));
	}

}
