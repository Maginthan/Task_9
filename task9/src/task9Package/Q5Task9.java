package task9Package;

import java.util.Scanner;

public class Q5Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Please enter your marks: ");
		 int marks = sc.nextInt();
		 
		 if (marks > 100) {
			 System.out.println("Invalid Input");
			 return;
		 }
		 
		 else if (marks == 100) {
			 System.out.println("The grade for you marks " + marks + " is " + "S");
		 }
		 else if (marks >= 90 && marks <= 99) {
			 System.out.println("The grade for you marks " + marks + " is " + "A");
		 }
		 else if (marks >= 80 && marks <= 89) {
			 System.out.println("The grade for you marks " + marks + " is " + "B");
		 }
		 else if (marks >= 70 && marks <= 79) {
			 System.out.println("The grade for you marks " + marks + " is " + "C");
		 }
		 else if (marks >= 60 && marks <= 69) {
			 System.out.println("The grade for you marks " + marks + " is " + "D");
		 }
		 else if (marks >= 50 && marks <= 59) {
			 System.out.println("The grade for you marks " + marks + " is " + "E");			 
		 }
		 
		 else {
			 System.out.println("The grade for you marks " + marks + " is " + "F");
		 }
		 
	}

}
