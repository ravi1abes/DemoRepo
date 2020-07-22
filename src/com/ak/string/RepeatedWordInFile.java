package com.ak.string;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedWordInFile {

	public static void main(String[] args) {
		HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("D:/My Folder/MyDocuments/Data Structures and Algorithms Made Easy in Java - Narasimha Karumanchi.pdf"));
			String currentLine = reader.readLine();
			while (currentLine != null) {
				String[] words = currentLine.toLowerCase().split(" ");
				for (String word : words) {
					if (wordCountMap.containsKey(word)) {
						wordCountMap.put(word, wordCountMap.get(word) + 1);
					} else {
						wordCountMap.put(word, 1);
					}
				}
				currentLine = reader.readLine();
			}
			String mostRepeatedWord = null;
			int count = 0;
			Set<Entry<String, Integer>> entrySet = wordCountMap.entrySet();
			for (Entry<String, Integer> entry : entrySet) {
				if (entry.getValue() > count) {
					mostRepeatedWord = entry.getKey();
					count = entry.getValue();
				}
			}
			System.out.println("The most repeated word in input file is : " + mostRepeatedWord);
			System.out.println("Number Of Occurrences : " + count);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
