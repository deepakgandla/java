class Encap{
	private int acc_no;
	private String name;
	private double balance;
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int a) {
		acc_no = a;
	}
	public  String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double b) {
		balance = b;
	}
	
}
public class Encapsulation {
public static void main(String args[]) {
	Encap obj=new Encap();
obj.setAcc_no(34567);
System.out.println("acc_no:  " + obj.getAcc_no());
obj.setBalance(45_000.00);
System.out.println("balance: " + obj.getBalance());
obj.setName("John");
System.out.println("name:" + obj.getName());

}
}
