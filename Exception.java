
public class Exception {
public static void main(String args[]) {
	
	
	try {
	int i=9/0;
	System.out.println(i);
	}
	catch(ArithmeticException e)
	{
		System.out.println("error");
		
	}
	finally
	{
	System.out.println("bye");
	}
	
}
}
