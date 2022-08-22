package com.te.addandreverse;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the array elements");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();

		}
		System.out.println("Enter the minimum number");
		int num = scanner.nextInt();
		int res = UserMainCode.addAndReverse(array, num);
		System.out.println("The reverse sum is : "+res);

	}

}
