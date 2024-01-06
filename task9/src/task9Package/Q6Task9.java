package task9Package;

import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Scanner;

public class Q6Task9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Please enter the number of the month: ");
	    int month = sc.nextInt();
	    System.out.println("Please enter the room rent per day: ");
	    float rent = sc.nextFloat();
	    System.out.println("Please enter the no of days stayed in the hotel: ");
		int days = sc.nextInt();
		
		float tariff = 0.00f;
	

		switch (month) {
		case 4, 5, 6, 11, 12:
			tariff = rent * days;
			float hike = tariff + ((tariff/100) * 20);
			//System.out.println("hike " + hike);
			Formatter formatter = new Formatter();
			formatter.format("%.2f", hike);
			System.out.println("The hotel tariff for " + days + " days are: " + formatter);
			break;
			
        default:
        	tariff = rent * days;
        	Formatter formatter1 = new Formatter();
			formatter1.format("%.2f", tariff);
        	System.out.println("The hotel tariff for " + days + " days are: " + formatter1);
        	
		}
	}
}
