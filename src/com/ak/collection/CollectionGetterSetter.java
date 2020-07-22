package com.ak.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionGetterSetter {
	private List<String> listTitles;

	public void setListTitles(List<String> titles) {
		//this.listTitles = titles;
		this.listTitles = new ArrayList<String>(titles);
	}

	public List<String> getListTitles() {
		//return this.listTitles;
		return new ArrayList<String>(this.listTitles);
		
	}
	



	@Override
	public String toString() {
		return "CollectionGetterSetter [listTitles=" + listTitles + "]";
	}

	public static void main(String[] args) {
          CollectionGetterSetter app=new CollectionGetterSetter();
          List<String> titles1=new ArrayList<String>();
          titles1.add("Name");
          titles1.add("eamil");
          titles1.add("address");
          titles1.add("phone");
          titles1.add("job");
          
       
          System.out.println("Title 1 : "+ titles1);
          app.setListTitles(titles1);
          //System.out.println("App : "+app.toString());
          
          titles1.set(1, "Kamit673");
          List<String> titles2=app.getListTitles();
          System.out.println("Title2 : "+titles2);
          
          titles2.set(2, "Bangalore");
          List<String> titles3=app.getListTitles();
          System.out.println("Titles3 : "+titles3);
          
          
          
          
          
          
          
          
          
          
          
          
	}
}
