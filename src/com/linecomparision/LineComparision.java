package com.linecomparision;

import java.util.Scanner;

public class LineComparision {

	public static void main(String[] args) {
		{
			double x1, x2, y1, y2, LengthOfLine , LengthOfLine2 ;  //Declaration 
			
			Scanner scanner = new Scanner(System.in);
			
			// taking input from user
			System.out.println("Enter the value of x1 :");
			x1 = scanner.nextDouble();
			
			System.out.println("Enter the value of x2 :");
			x2 = scanner.nextDouble();
			
			System.out.println("Enter the value of y1 :");
			y1 = scanner.nextDouble();
			
			System.out.println("Enter the value of y2 :");
			y2 = scanner.nextDouble();
			
			LengthOfLine = Math.sqrt(  (Math.pow(x2-x1 , 2))  + (Math.pow(y2-y1 , 2)) );
			System.out.println(LengthOfLine);
			
			
			System.out.println("Enter the value of x1 : ");
			x1 = scanner.nextDouble(); 
			
			System.out.println("Enter the value of x2 : ");
			x2 = scanner.nextDouble(); 
			
			System.out.println("Enter the value of y1 : ");
			y1 = scanner.nextDouble(); 
			
			System.out.println("Enter the value of y2 : ");
			y2 = scanner.nextDouble(); 
			
			LengthOfLine2 = Math.sqrt(  (Math.pow(x2-x1, 2))  + (Math.pow(y2-y1, 2)));
			System.out.println(LengthOfLine2);
			
			String s1,s2;
			s1 = Double.toString(LengthOfLine);
			s2 = Double.toString(LengthOfLine2);
			System.out.println("Equality of two length is " +s1.equals(s2));
		}
	}
}

	
