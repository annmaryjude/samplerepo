package collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
	Set<String> x=new HashSet <String>();
	Set<String>a=new HashSet<String>();
	// add method
	x.add("Apple");
	x.add("Apple");
	x.add("Orange");
	x.add("Strawberry");
	x.add("Mango");
	System.out.println(x);
	a.add("Pappaya");
	a.add("Guava");
	System.out.println(a);
	//addAll Method
	x.addAll(a);
	System.out.println(x);
	//contains Method
	System.out.println(x.contains("Guava"));
	//contains All to check whether all the elements of one set in another set
	System.out.println(x.containsAll(a));
	//isEmpty
	System.out.println(x.isEmpty());
	//remove
	x.remove("Orange");
	System.out.println(x);
	//remove All to remove all the elements of a from x
    x.removeAll(a);
	System.out.println(x);
	//size
	System.out.println(a.size());
	a.clear();
	System.out.println(a);
	
	

	}

}
