interface Inter{
	void show();
	default void abc() {
		System.out.println("Defining method");
	}
}
class Dee implements Inter{
	
	public void show() {
		
		System.out.println("in show");
	}
	
	
}
public class Interface {
public static void main(String args[]) {
	Inter obj =new Dee();
	obj.show();
	obj.abc();

            
}
}
