package com.te.unique;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int given = scanner.nextInt();
		int unique = UserMainCode.getUnique(given);
		if (unique==1)
			System.out.println(" unique");
		else
			System.out.println("not unique");
	}

}
