package task9Package;

import java.util.Scanner;

public class Q7Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Please enter the first number a: ");
	    int a = sc.nextInt();
	    System.out.println("Please enter the second number b: ");
	    int b = sc.nextInt();
	    System.out.println("Please enter the second number c: ");
	    int c = sc.nextInt();
		
//		if (a > b && a > c) {
//			System.out.println(a + " is the largest number");		
//		}
//		
//		else if (b > c && b > a) {
//			System.out.println(b + " is the largest number");
//		}
//		
//		else {
//			System.out.println(c + " is the largest number");
//		}
		
		int Max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		
		System.out.println("The largest number among " + a +" - "+ b +" - "+ c + " is: " + Max);
		
		
	}

}
