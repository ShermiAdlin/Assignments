package com.te.evenSquare;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int given=scanner.nextInt();
		int res=UserMainCode.SumOfSquaresOfEvenDigits(given);
		System.out.println(res);
	}

}
