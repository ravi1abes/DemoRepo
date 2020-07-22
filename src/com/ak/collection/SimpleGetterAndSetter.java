package com.ak.collection;

public class SimpleGetterAndSetter {
	private int number;

	public void setNumber(int num) {
		this.number = num;
	}

	public int getNumber() {
		return this.number;
	}
	
	
	private int[] scores;
	 
	public void setScores(int[] scr) {
	  //  this.scores = scr;
	    this.scores = new int[scr.length];
	    System.arraycopy(scr, 0, this.scores, 0, scr.length);
	}
	
	public int[] getScores() {
		//return this.scores;
		int[] copy = new int[this.scores.length];
	    System.arraycopy(this.scores, 0, copy, 0, copy.length);
	    return copy;
	}
	
	public void displayScores(int[] intArray) {
	    for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]+" ");
		}
	     
	}
}
