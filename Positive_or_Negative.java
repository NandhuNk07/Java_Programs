package task;

import java.util.Scanner;

public class Positive_or_Negative {

	public static void main(String[] args) {
			
			Scanner posive=new Scanner(System.in);
			System.out.println("Enter the Number: ");
			int num=posive.nextInt(); 
			
			if(num>0) {
				System.out.println("It is Positive Number");
			}
			if(num<0) {
				System.out.println("It is Negative Number");
			}
			else {
				System.out.println("This is neither a positive nor a negative number");
			}
		}

}
