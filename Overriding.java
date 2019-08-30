class Bank{
	
int getIntrest() {return 0;
}
}

class SBI extends Bank{
	int getIntrest() {return 7;}
}
class ICICI extends Bank{
	int getIntrest() {return 8;}
}

class Canara extends Bank{
	int getIntrest() {return 9;}
}




public class Overriding {
public static void main(String args[]) {
	
SBI s=new SBI();
ICICI i=new ICICI();
Canara c=new Canara();
System.out.println("Intrest of SBI bank: "   + s.getIntrest());
System.out.println("Intrest of ICICI bank: " + i.getIntrest());
System.out.println("Intrest of Canara bank: " + c.getIntrest());
}
}
