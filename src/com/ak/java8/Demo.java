package com.ak.java8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {
		Map<String,Integer> hashMap=new HashMap<String, Integer>();
		hashMap.put("Amit", 101);
		hashMap.put("Ankita", 201);
		hashMap.put("Nahe", 102);
		hashMap.put("Payal", 010);
		hashMap.put("Jon", 100);
		
		// Iteration through EntrySet Using ForEach loop
		for(Map.Entry<String, Integer> entrySet : hashMap.entrySet()) {
			//System.out.println("Key = "+entrySet.getKey()+" "+"Value = "+entrySet.getValue());
		}
		//Iterating through EntrySet Using  Iterator
		Iterator<Map.Entry<String, Integer>> itr=hashMap.entrySet().iterator();
		while(itr.hasNext()) {
              Map.Entry<String, Integer> entry = itr.next();
             // System.out.println("Key = "+entry.getKey()+" "+"Value = "+entry.getValue());
		}
		// Iteration through keySet Using ForEach loop
		for(String key : hashMap.keySet()) {
			//System.out.println("Key = "+key);
		}
		//Iterating through KeySet using Iterator
		Set<String> keySet=hashMap.keySet();
		Iterator<String> keySetIterator=keySet.iterator();
		while(keySetIterator.hasNext()) {
			String key=keySetIterator.next();
			//System.out.println("key = "+key);
		}
	
		TreeMap<String, Integer> treeMap=new TreeMap<String, Integer>(hashMap);
		for(Map.Entry<String, Integer> entrySet : treeMap.entrySet()) {
			System.out.println("Key = "+entrySet.getKey()+" "+"Value = "+entrySet.getValue());
		}
		

	}
}
