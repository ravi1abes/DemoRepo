package com.ak.string;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountInFile {

	public static void main(String[] args) {
		BufferedReader reader = null;
		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		try {
			reader = new BufferedReader(new FileReader(
					"D:/My Folder/MyDocuments/Data Structures and Algorithms Made Easy in Java - Narasimha Karumanchi.pdf"));
			String currentLine = reader.readLine();
			while (currentLine != null) {
				lineCount++;
				String[] words = currentLine.split(" ");
				wordCount = wordCount + words.length;

				for (String word : words) {
					charCount = charCount + word.length();
				}
				currentLine = reader.readLine();
			}
			System.out.println("Char Count : " + charCount);
			System.out.println("Word Count : " + wordCount);
			System.out.println("Line Count : " + lineCount);

		}

		catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
