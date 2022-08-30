package com.te.playingwithstrings;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a size and elements of array:");
			int size = scanner.nextInt();
			String str[] = new String[size];

			for (int i = 0; i < str.length; i++) {
				str[i] = scanner.next();
			}
			System.out.println(" Enter a number :");
			int num = scanner.nextInt();

			System.out.println(UserMainCode.formString(str, num));

		}
}
