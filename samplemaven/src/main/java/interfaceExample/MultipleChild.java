package interfaceExample;

public class MultipleChild implements MultipleParent1,MultipleParent2{
	public void display1()
	{
		System.out.println("child method");
	}

	public static void main(String[] args) {
		MultipleChild obj= new MultipleChild ();
		obj.display();
		obj.display1();
		obj.print();
	}

	@Override
	public void display() {
		System.out.println("display parent1");
		
	}

	@Override
	public void print() {
		System.out.println("print parent2");
		
	}

}
