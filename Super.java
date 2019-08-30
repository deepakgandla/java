class Animal{
	
void eat() {
	System.out.println("eating.......");
}
	
}
class Dog extends Animal{
void eat() {
	
	System.out.println("eating bread......");
	
}
void bark() {
	System.out.println("barking......");
}
	void habit() {
		super.eat();
		bark();
}
}
public class Super {
public static void main(String args[]) {
Dog d=new Dog();
d.habit();
	
}
}


