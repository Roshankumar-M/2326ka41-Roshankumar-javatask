package codejava;

import java.util.Scanner;

public class SimpleInterest {
	 public static void main(String args[]) {
     	Scanner in=new Scanner(System.in);
     	float a,r,time;
     	System.out.println("Enter the amt:");
     	a=in.nextInt();
     	System.out.println("Enter the rate:");
     	r=in.nextInt();
     	System.out.println("Enter the time:");
     	time=in.nextInt();
     	float SI=(a*r*time)/100;
     	System.out.println("Simple Interest"+SI);
     	in.close();
     	
     }

}
