
public class Constructor {
int x;
String some;

public Constructor(int y,String s) {
	
	x=y;
	some=s;
}
	public static void main(String args[]) {
		
	Constructor obj=new Constructor(5,"five");
System.out.println(obj.x + " " + obj.some);
		System.out.println("Interesting");
	}
}
