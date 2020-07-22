package com.ak.java8;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list=new ArrayList<String>();
		list.add("Amit");
		list.add("Kumar");
		list.add("Singh");
		list.add("Bangalore");
		list.add("Indai");
		
		System.out.println("List : "+list);
		
		String[] strArray=new String[list.size()];
		strArray=list.toArray(strArray);
		
		for(String s : strArray) {
			System.out.println("List to String : "+s);
		}
		
		
	}

}
