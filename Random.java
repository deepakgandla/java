import java.util.Scanner;

public class Random {
public static void main(String args[]) {
	int number=(int)(Math.random()*10);
	int lottery[]=new int[12];
	int i , a=0;
	Scanner value=new Scanner(System.in);
	for( i=1;i<11;i++) {
	System.out.println("Enter lottery ticket number:"+i);
lottery[i]=value.nextInt();
	}
	for( i=1;i<11;i++) {
	if(number==lottery[i]) {
		System.out.println(+i+" You have won the lottery with number "+number);
	 a=1;
	}
	
	
	
	
	}    
	 
	if(a==0)
		 {

			System.out.println("Sorry rall");
			System.out.println("This is actaual ticket number won"+number);
		 }
	value.close();
	}
}
