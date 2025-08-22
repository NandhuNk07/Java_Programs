package task;

import java.util.Scanner;

public class leapyear_or_nonleapyear {

	public static void main(String[] args) {
		
			Scanner leap=new Scanner(System.in);
			System.out.println("Enter the Year: ");
			int year=leap.nextInt(); 
			
			
			if(year%4==0) {
				System.out.println("This year is Leap Year.");
			}
			else {
				System.out.println("This year is Not a Leap Year.");
			}

		}

}
