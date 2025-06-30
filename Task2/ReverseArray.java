package codejava;
import java.util.*;

public class ReverseArray {
	public static void main(String args[]) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Array Elements");
		for(int i=0;i<arr.length;i++) {
		arr[i]=in.nextInt();
		}
		System.out.println("Reverse Array");
	    for(int i=n-1;i>=0;i--) {
	    	System.out.println(arr[i]);
	    }
	    in.close();
	}

}