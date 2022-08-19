package com.te.sumOFNonPrime;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int given=scanner.nextInt();
		int res=UserMainCode.addNumbers(given);
		System.out.println("The sum of non prime numbers : "+res);
	}

}
