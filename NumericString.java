package com;

import java.util.Scanner;

public class NumericString {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Numeric String: ");
		String numericString=obj.nextLine();
		
		Integer intValue =new Integer(numericString);
        Long longValue = new Long (numericString);
        Float floatValue = new Float(numericString);
        Double doubleValue = new Double(numericString);
		
    
		System.out.println("Integer num: "+intNum);
		System.out.println("Long num: "+longNum);
		System.out.println("Float num: "+floatNum);
		System.out.println("Double num: "+doubleNum);

		
	}

}




