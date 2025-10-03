package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericMethods {

	public static void main(String[] args) {
	List k=new ArrayList();
	k.add("blue");
	k.add("black");
	k.add("green");
	System.out.println(k);
	System.out.println(k.get(2));
	k.set(1,"white");
	System.out.println(k);
	System.out.println(k.indexOf("blue"));
	System.out.println(k.lastIndexOf("green"));
	k.remove(0);
	System.out.println(k);
	k.remove("white");
	System.out.println(k);
	System.out.println(k.contains("green"));
	System.out.println(k.isEmpty());
	System.out.println(k.size());
	

	}

}
