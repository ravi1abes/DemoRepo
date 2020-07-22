package com.ak.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateWordInString {
	public static void findNoOfWordOccurance(String inputString) {
		String[] strArray = inputString.split(" ");
		int wc = 1;
		for (int i = 0; i < strArray.length; i++) {
			for (int j = i + 1; j < strArray.length; j++) {
				if (strArray[i].equals(strArray[j])) {
					wc = wc + 1;
					strArray[j] = "0";
				}
			}
			if (strArray[i] != "0") {
				System.out.println(strArray[i] + " : " + wc);
				wc = 1;
			}
		}
	}

	public static void findDuplicate(String inputString) {
		List<String> list = Arrays.asList(inputString.split(" "));
		Set<String> uniqueWords = new HashSet<String>(list);
		for (String word : uniqueWords) {
			System.out.println(word + ":" + Collections.frequency(list, word));
		}
	}

	public static void findDuplicateWordsInSting(String inputString) {
		System.out.println("Input String : " + inputString);
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		String[] words = inputString.split(" ");
		for (String word : words) {
			if (wordCount.containsKey(word.toLowerCase())) {
				wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase()) + 1);
			} else {
				wordCount.put(word.toLowerCase(), 1);
			}
		}
		Set<String> wordsInString = wordCount.keySet();
		for (String word : wordsInString) {
			if (wordCount.get(word) > 1) {
				System.out.println(word + " : " + wordCount.get(word));
			}
		}
	}

	public static void main(String[] args) {
		// findDuplicateWordsInSting("Amit Kumar Singh Amit is a good good boy");
		//findDuplicate("Hi is is good boy");
		findNoOfWordOccurance("amit kumar singh amit amit ");
	}
}
