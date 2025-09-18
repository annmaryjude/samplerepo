package inheritence;

public class HierarchialChild1 extends HierarchialParent {
	public void display1()
	{
		System.out.println("child 1");
	}

	public static void main(String[] args) {
		HierarchialChild1 obj=new HierarchialChild1();
		obj.display1();
		obj.display();
		
		// TODO Auto-generated method stub

	}

}
