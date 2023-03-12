package com.intro;

import java.util.Scanner;

public class Addiingofdigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the digits to add????");

		int num = sc.nextInt();

		int a = 0;

		
			a = num % 10;
			num= num / 10;
			
		
		System.out.println("Reversed number is =" + a);
		System.out.println("num =" + num);
		int c = a + num;
		System.out.println("result is =" + c);
	}

}
