package task9Package;

import java.util.Scanner;

public class Q4Task9 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
		
		System.out.print("Enter Rows = ");
		int rows = sc.nextInt();	
		
		
		for (int i = 1 ; i <= rows; i++ ) 
		{
			for (int j = 1 ; j <= rows; j++ ) 
			{
				if(j == i || i + j == rows + 1) 
				{
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
		}

}
}
