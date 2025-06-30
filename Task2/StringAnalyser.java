package codejava;

import java.util.Scanner;

public class StringAnalyser {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String sentence=in.nextLine();
		String[] words=sentence.split(" ");
		int wc=0,ct=0;
		for(int i=0;i<words.length;i++) {
			wc++;
		}
		System.out.println("Word count: "+wc);
		
	    String result = sentence.replaceAll("\\s", "");
		System.out.println(result);
	    ct=result.length();
		System.out.println("Character count: "+ct);
	
		System.out.print("Reversed sentence: ");

		for(int i=words.length-1;i>=0;i--) {
			System.out.print(words[i]);
		}
	System.out.println();
		
	String longest=" ";
	System.out.print("Longest word in sentence: ");
		for(int i=0;i<words.length;i++) {
			if(words[0].length()>words[i].length()) {
				longest=words[0];
			}
			else if(longest.length()<words[i].length()){
				longest=words[i];
			}
		}
		System.out.print(longest);
		in.close();
	}

}