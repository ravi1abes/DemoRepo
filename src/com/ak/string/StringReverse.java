package com.ak.string;

public class StringReverse {

	public static void stringReverse(String inputString) {
		char[] charArray = inputString.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
	}
	
	public static void reverseString(String inputString) {
		String reverse =" ";
		for(int i=inputString.length()-1;i>=0;i--) {
			reverse=reverse+inputString.charAt(i);	
		}
		System.out.println("Origional String : "+inputString);
		System.out.println("Reverse String : "+reverse);
	}

	public static void main(String[] args) {
     //  stringReverse("Amit");
       reverseString("Kumar");
	}
}
