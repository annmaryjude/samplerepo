package abstraction;

public class AbstractionChild extends AbstactionParent {
	public void print()
	{
		System.out.println("Abstract");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AbstractionChild obj=new AbstractionChild();
obj.display();
obj.display1();
obj.print();
	}


	@Override
	public void display() {
		System.out.println("new abstract");
		// TODO Auto-generated method stub
		
	}

}
