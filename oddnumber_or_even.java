package task;

import java.util.Scanner;

public class oddnumber_or_even {

	public static void main(String[] args) {
		Scanner oddeven=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num =oddeven.nextInt();

		
		if(num%2==0) {
			System.out.println(num+" is Even Number.");
		}
		else {
			System.out.print(num+" is Odd Number.");
		}

	}

}

