package com.te.oddNUM;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scanner.nextInt();
		if (num < 0)
			System.out.println("You have entered negative number");
		else {
			int res = UserMainCode.checkSum(num);
			if (res == 1)
				System.out.println("sum is odd");
			else
				System.out.println("sum is even");

		}
	}

}
