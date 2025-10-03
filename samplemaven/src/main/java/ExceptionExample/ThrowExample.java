package ExceptionExample;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int age =16;
   if(age>=18)
   {
	   System.out.println("elligible");
   }
	   else
	   {
		   throw new ArithmeticException("age under than 18");
	   }
	}

}
