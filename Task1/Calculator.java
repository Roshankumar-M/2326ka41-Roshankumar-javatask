package codejava;

import java.util.Scanner;



public class Calculator {
		 public static void add(int num1 ,int num2 ){
			 System.out.println(num1+num2);
		 }
		 public static void sub(int num1 ,int num2 ){
			 System.out.println(num1-num2);
		 }
		 public static void mul(int num1,int num2) {
			 System.out.println(num1*num2);
		 }
		 public static void div(int num1,int num2) {
			 System.out.println(num1/num2);
		 }
		 
		public static void main(String args[]) {
			Scanner in=new Scanner(System.in);
			 int option,num1,num2;
			 
			  do {
				 System.out.println("***CALCULATOR***");
				 System.out.println("1.Add");
				 System.out.println("2.sub");
				 System.out.println("3.mul");
				 System.out.println("4.div");
				 System.out.println("Choose your option:");
				 option=in.nextInt();
				
				 if(option>4) {
					 System.out.println("INVALID OPTION");
					 break;
				 }
				 
				 System.out.println("Enter the number:");
				 num1=in.nextInt();
				 System.out.println("Enter the second number:");
				 num2=in.nextInt();
				 
				 
				 switch(option) {
				 case 1:
					 add(num1,num2);
					 break;
				 case 2:
					 sub(num1,num2);
					 break;
				 case 3:
					 mul(num1,num2);
					 break;
				 case 4:
					 div(num1,num2);
					 break;
				default :
					System.out.println("INVALID OPTION");
				 }
				 }while(false);
			
		}

}
