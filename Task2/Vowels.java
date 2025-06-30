package codejava;

import java.util.Scanner;

public class Vowels {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String:");
		String  word=in.nextLine();
		word=word.toLowerCase();
		char[] ch=word.toCharArray();
		String vowel="aeiou";
		int count=0,cons=0;
		for(int i=0;i<ch.length;i++) {
			if(vowel.indexOf(ch[i]) != -1) {
				count++;
			}
			
		
		else if(Character.isLetter(ch[i])) {
			cons++;
		}
		}
		System.out.println("Vowels:"+count);
		System.out.println("Consonants:"+cons);
		in.close();
		
	}

}