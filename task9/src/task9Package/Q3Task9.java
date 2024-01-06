package task9Package;

import java.util.Scanner;

public class Q3Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Please enter a number: ");
	    int a = sc.nextInt();
	    
		int counter = 1;
		
		
		for(int i=1;i<=a;i++){
			for(int j=1;j<=i;j++){
				System.out.print(counter+ " ");
				counter++;
			}
			System.out.println();
		}
		
	}

}
