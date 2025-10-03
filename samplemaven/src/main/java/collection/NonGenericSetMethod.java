package collection;

import java.util.HashSet;
import java.util.Set;

public class NonGenericSetMethod {

	public static void main(String[] args) {
		
	Set s=new HashSet();
	Set s1=new HashSet();
s.add("Jude");
s.add("Ann");
s.add("kichu");
s.add("sophy");
s1.add("car");
s1.add("scooter");

System.out.println(s);
System.out.println(s1);
s.addAll(s1);
System.out.println(s);
System.out.println(s.contains("car"));
System.out.println(s.containsAll(s1));
System.out.println(s1.isEmpty());
s.remove("car");
System.out.println(s);
s.removeAll(s1);
System.out.println(s);
System.out.println(s.size());
s1.clear();
System.out.println(s1);




	}

}
