package inheritence;

public class HierarchialChild2 extends HierarchialParent {
	
	public void display2()
	
	{
		System.out.println("the child 2");
	}

	public static void main(String[] args) {
		HierarchialChild2 obj=new HierarchialChild2();
		obj.display2();
		obj.display();
		// TODO Auto-generated method stub

	}

}
