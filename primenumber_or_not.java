package task;

import java.util.Scanner;

public class primenumber_or_not {

	    public static void main(String[] args) {
	        Scanner prime = new Scanner(System.in);

	        System.out.print("Enter the number: ");
	        int num = prime.nextInt();
	        //int i = 2;
	        
	        //if (i == num) {
                //System.out.println(num + " is a Prime Number.");
            //}
	        
	        //if (num % i == 0) {
	        	//System.out.println(num + " is NOT  a Prime Number.");
	        //}

	        if (num <= 1) {
	            System.out.println(num + " is NOT a Prime Number.");
	       } 
	        else if (num == 2 || num == 3 || num == 5 || num == 7) {
	            System.out.println(num + " is a Prime Number.");
	        } 
	        else if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
	            System.out.println(num + " is NOT a Prime Number.");
	        } 
	        else {
	            System.out.println(num + " is  a Prime Number.");
	        }
	    }
	}
