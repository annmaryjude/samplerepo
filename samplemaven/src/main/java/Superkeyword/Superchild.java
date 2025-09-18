package Superkeyword;

public class Superchild extends Supervariable {
String s="java";

public void display()
{
	System.out.println(s);
	System.out.println(super.s);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Superchild obj=new Superchild();
obj.display();
	}

}
