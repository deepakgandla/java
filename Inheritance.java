class Being {
	
void run() {
	System.out.println("Eating.......");
}
}
	class Cat extends Being{
		void work() {
			System.out.println("Meow.....");
		}
	
}
	class Cow extends Cat{
		void eat() {
			System.out.println("Grass");
;		}
	}
public class Inheritance {
public static void main(String args[]) {
	Cow d=new Cow();
	d.run();
	d.work();
	d.eat();
}
}
