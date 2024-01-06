package task9Package;

import java.util.Scanner;

public class Q1Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Please enter a word: ");
		String word = sc.nextLine();
		String reverseStr = "";
		
		
		
		for (int i=(word.length()-1);i >=0; --i) {
			reverseStr = reverseStr + word.charAt(i);
		}

		
		if(word.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(word + " is a Palindrome String");
		}
		
		else {
			System.out.println(word + " is not a Palindrome String");
		}
	}

}
