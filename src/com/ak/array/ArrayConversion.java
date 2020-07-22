package com.ak.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConversion {

	public static void  convertArrayToArrayList(String[] strArray) {
		ArrayList<String>  list=new ArrayList<String>(Arrays.asList(strArray));
		System.out.println(list);	
	}
	
	public static void convertArrayListToArray(ArrayList<String> list) {
		
		
		String[] array=new String[list.size()];
		list.toArray();
		for(String str : array) {
			System.out.println(str);
		}
		
	}
	public static void main(String[] args) {
	//	convertArrayToArrayList(new String[] {"Amit","Kumar","Singh"});
		/*
		 * ArrayList< String> list=new ArrayList<String>(); list.add("Amit");
		 * list.add("Kumar"); list.add("Singh");
		 */
		
	//	convertArrayListToArray(list);
		
		
		 ArrayList<String> list = new ArrayList<String>();
         
	        list.add("JAVA");
	          
	        list.add("JSP");
	          
	        list.add("ANDROID");
	          
	        list.add("STRUTS");
	          
	        list.add("HADOOP");
	          
	        list.add("JSF");
	          
	        String[] array = new String[list.size()]; 
	          
	        list.toArray(array);
	          
	        for (String string : array)
	        {
	            System.out.println(string);
	        }
	}
}
