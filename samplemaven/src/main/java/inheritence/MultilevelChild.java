package inheritence;

public class MultilevelChild extends MultilevelParent {
	public  void display1()
	{
	System.out.println("class b");	
	}

	public static void main(String[] args) {
		
		MultilevelChild obj=new MultilevelChild();
		obj.display();
		obj.print();
		obj.display1();

	}

}
