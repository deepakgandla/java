import java.util.Scanner;
public class Leap {
public static void main(String args[]) {
	Scanner value=new Scanner(System.in);
	
	int year1,year2;
	System.out.println("Enter a  start year:");

	year1=value.nextInt();
	System.out.println("Enter a end year:");
	year2=value.nextInt();
	for(int i=year1;i<year2;i++) {
	if(i%4==0&&i%100!=0 ||i%400==0) {
		System.out.println(+i+"is a leap year");
		
	}
	else {
		System.out.println(+i+"is not a leap year");
	}
	}
	value.close();
}
}
