package com.te.vowels;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the word");
		String str = scanner.nextLine();
		System.out.println(UserMainCode.testVowels(str));
	}

}
