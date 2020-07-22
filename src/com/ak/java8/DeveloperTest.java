package com.ak.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DeveloperTest {

	public static void main(String[] args) {
		List<Developer> listDevs = getAllDevelopers();
		System.out.println("Before Sort ");
		for (Developer dev : listDevs)
			System.out.println(dev);

		// Sorted by ID
		listDevs.sort(new Comparator<Developer>() {
			@Override
			public int compare(Developer d1, Developer d2) {

				return d2.getId() - d1.getId();
			}
		});
		System.out.println("After Sort");
		for (Developer d : listDevs) {
			System.out.println(d);
		}
		
		// Sort by Lambda
		listDevs.sort((Developer o1, Developer o2) -> o2.getId() - o1.getId());
		// for each
		//listDevs.forEach((developer) -> System.out.println(developer));
	}
	

	public static List<Developer> getAllDevelopers() {
		List<Developer> result = new ArrayList<Developer>();
		result.add(new Developer(101, "Amit"));
		result.add(new Developer(234, "Neha"));
		result.add(new Developer(247, "Payal"));
		result.add(new Developer(834, "Mona"));
		result.add(new Developer(323, "Nancy"));

		return result;
	}

}
