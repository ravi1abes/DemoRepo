package com.ak.collection;

public class Test {

	public static void main(String[] args) {
		SimpleGetterAndSetter obj=new SimpleGetterAndSetter();
		obj.setNumber(123);
		int num =obj.getNumber();
		System.out.println("Get Number = " +num);
		
	
		int[] myScores = {5, 5, 4, 3, 2, 4};
		 
		obj.setScores(myScores);
		int[] objArray=obj.getScores();
		obj.displayScores(objArray);
		System.out.println("==============");
		
		myScores[1]=99;
		obj.displayScores(objArray);
		System.out.println("--------------------");
		
		int[] copyScores = obj.getScores();
		copyScores[1] = 1;
		obj.displayScores(copyScores);
		       
		
	}

}
