package Superkeyword;

public class Superchildmethod extends Supermethod{
	public void display()
	{
		super.display();
		System.out.println("Super 1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superchildmethod obj=new Superchildmethod();
		obj.display();

	}

}
