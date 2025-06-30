package codejava;

public class LeapYear {
	public static void main(String args[]) {
        int year=2024;
        if((year%4==0 && year%100!=0) || year%400==0) {
        	System.out.print("This a leap year");
        }
        else {
        	System.out.print("This is not a leap year");
        }
        }

}
