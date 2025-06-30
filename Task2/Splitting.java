package codejava;

import java.util.Scanner;

public class Splitting {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the sentance");
		String Sentance=in.nextLine();
		System.out.println("Splitting Words");
		String[] str=Sentance.split(" ");
		System.out.println(str);
		for(String word:str) {
			System.out.println(word);
		}
in.close();	}

}