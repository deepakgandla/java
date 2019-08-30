import java.util.Scanner;
public class Birth {
public static void main(String args[]) {
	int number;
	Scanner value=new Scanner(System.in);
	
String s1="1 3 5 7\n"
		+ "9 11 13 15\n"
		+ "17 18 19 21\n"
		+ "23 25 27 29 31\n";
	
 
	
String s2="2 3 6 7\n"
		+ "10 11 14 15\n"
		+ "18 19 22 23\n"
		+ "26 27 30 31\n";




String s3="4 5 6 7\n"
		+ "12 13 14 15\n"
		+ "18 19 22 23\n"
		+ "28 29 30 31\n";





String s4="8 9 10 11\n"
		+ "12 13 14 15 20\n"
		+ "24 25 26 27\n"
		+ "28 29 30 31\n";





String s5="16 17 18 19\n"
		+ "20 21 22 23\n"
		+ "25 26 27 28\n"
		+ "29 30 31\n";

int date=0;
System.out.println("set 1:\n");
System.out.println(s1);
System.out.println("Check ur Birth Date if date is in set1 press 1 else press 0");
number=value.nextInt();
	if(number==1)
		date +=1;
	System.out.println("set 2:\n");
	System.out.println(s2);
	System.out.println("Check ur Birth Date if date is in set2 press 1 else press 0");
	number=value.nextInt();
		if(number==1)
			date +=2;
		System.out.println("set 3:\n");
		System.out.println(s3);
		System.out.println("Check ur Birth Date if date is in set3 press 1 else press 0");
		number=value.nextInt();
			if(number==1)
				date +=4;
			System.out.println("set 4:\n");
			System.out.println(s4);
			System.out.println("Check Birth Date if date is in set4 press 1 else press 0");
			number=value.nextInt();
				if(number==1)
					date +=8;
				System.out.println("set 5:\n");
				System.out.println(s5);
				System.out.println("Check Birth Date if date is in set5 press 1 else press 0");
				number=value.nextInt();
					if(number==1)
						date +=16;
					System.out.println("Dirth date:"+date);
				value.close();
}
}
