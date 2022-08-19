package com.te.digit7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int given = scanner.nextInt();
		int count = UserMainCode.countSeven(given);
		System.out.println(count + " time 7 was present");
	}
}
