package collection;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <String> a =new ArrayList<String>();
a.add("blue");
a.add("green");
a.add("blue");
System.out.println(a);
String s = a.get(2);
System.out.println(s);
a.set(1, "yellow");
System.out.println(a);
System.out.println(a.indexOf("yellow"));
a.remove(0);
System.out.println(a);
System.out.println(a.contains("blue"));
System.out.println(a.size());
System.out.println(a.isEmpty());
System.out.println(a.lastIndexOf("blue"));
	}

}
