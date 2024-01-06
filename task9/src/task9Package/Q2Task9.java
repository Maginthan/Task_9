package task9Package;

import java.util.Scanner;

public class Q2Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Please enter a word: ");
		String word = sc.nextLine();
		String reverseStr = "";		
		
		for (int i=(word.length()-1);i >=0; --i) {
			reverseStr = reverseStr + word.charAt(i);
		}

		System.out.println("The entered " + word + " is reversed to " + reverseStr.toLowerCase());

	}

}
