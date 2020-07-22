package com.ak.java8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class CustomerSort {

	public static void main(String[] args) {
		HashMap<Customer, Integer> hashMap=new HashMap<Customer, Integer>();
		hashMap.put(new Customer(101, "Amit"), 1);
		hashMap.put(new Customer(212, "Ankur"), 9);
		hashMap.put(new Customer(701, "Kishan"), 8);
		hashMap.put(new Customer(576, "Ritika"), 3);
		hashMap.put(new Customer(354, "Payal"), 7);
		
	    // Iterating through entry Set Using For each loop 
		for(Map.Entry<Customer, Integer> entry : hashMap.entrySet()) {
			//System.out.println("Key = "+entry.getKey()+" "+"Value = "+entry.getValue());
		} 
		// Iterating through entry set Using iterator
		Iterator<Map.Entry<Customer, Integer>> itr=hashMap.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Customer, Integer> entry=itr.next();
			//System.out.println("Key = "+entry.getKey()+"  "+"Value = "+entry.getValue());
		}
		
		// Sort using key 
		TreeMap<Customer, Integer>  treeMap=new TreeMap<Customer, Integer>(hashMap);
		Set<Entry<Customer, Integer>> entries = treeMap.entrySet();
        for(Entry<Customer, Integer> entry : entries) {
        	System.out.println("Keys = "+entry.getKey()+" "+"Values = "+entry.getValue());
        }
		
	}

}
