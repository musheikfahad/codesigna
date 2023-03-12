package com.intro;

import java.util.Scanner;

public class Polyndrome {
	
	public static void main(String[] args) {
	
		
		String original,reverse =""; // objects of string class
		
		Scanner inp = new Scanner(System.in);
		System.out.println("enter the string or numer to ch=eck if it is a polyndrom");
		original = inp.nextLine();
		int length = original.length();
		for (int i = length -1; i >=0 ; i--) {
			
			reverse = reverse+ original.charAt(i);
			
			if (original.equals(reverse)) {
				
				System.out.println("given number/string polyndrome");
					
				
			}
			else 
				System.out.println("enter string/number isnt palindrome");
		}
		
	
	
		

	}

}
