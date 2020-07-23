package pH;

import java.util.Scanner;

public class pH {
	
	public static void main(String[] args) {
	Scanner keyboard=new Scanner(System.in);
	System.out.println("Enter pH value");
		
	double pH=keyboard.nextDouble();

		if(pH>=0 && pH<7)
		System.out.println("pH is acidic");

		else if (pH==7)
		System.out.println("pH is neutral");

		else if (pH>7 && pH <=14)
		System.out.println("pH is basic");

		else
		System.out.println("no such pH value");
	}
}