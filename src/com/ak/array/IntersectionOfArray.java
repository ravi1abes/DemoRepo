package com.ak.array;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfArray {
	public static void findIntersectionOfArray(String[] strArray1, String[] strArray2) {
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < strArray1.length; i++) {
			for (int j = 0; j < strArray2.length; j++) {
				if (strArray1[i].equals(strArray2[j])) {
					set.add(strArray1[i]);
				}
			}
		}
		System.out.println("First Arrays : " + Arrays.toString(strArray1));
		System.out.println("Second Arrays : " + Arrays.toString(strArray2));
		System.out.println("Common Element : " + set);
	}
	public static void main(String[] args) {
		String[] str1= {"Amit","Kumar","Singh","Bangalore"};
		String[] str2= {"Kumar","Amit","Bangalore","Khan"};
		findIntersectionOfArray(str1, str2);
	}

}
