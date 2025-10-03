package interfaceExample;

public class Interface2 implements Interface1{

	public static void main(String[] args) {
		Interface2 obj= new Interface2();
		obj.display();
		obj.print();
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		System.out.println("display1");
		
	}

	@Override
	public void print() {
	System.out.println("display2");
		
	}

}
