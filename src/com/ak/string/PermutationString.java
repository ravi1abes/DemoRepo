package com.ak.string;

public class PermutationString {

	public static String swapString(String inputString, int a, int b) {
		char[] charArray = inputString.toCharArray();
		char ch = charArray[a];
		charArray[a] = charArray[b];
		charArray[b] = ch;

		return String.valueOf(charArray);
	}

	public static void findPermutation(String str, int start, int end) {
		if (start == end - 1) {
			System.out.println(str);
		} else {
			for (int i = start; i < end; i++) {
				str = swapString(str, start, i);
				findPermutation(str, start + 1, end);
				str = swapString(str, start, i);

			}
		}
	}

	public static void main(String[] args) {
		String str = "JSP";
		int len = str.length();
		System.out.println("All the permutations of the string are: ");
		findPermutation(str, 0, len);
	}

}
