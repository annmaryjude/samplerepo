package Superkeyword;

public class Superchildconstructor extends SuperConstructor {
	public Superchildconstructor()
	{
		super(2,3);
		System.out.println("child constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superchildconstructor obj=new Superchildconstructor();
		
	}

}
