package com.te.vowels;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word");
		String given = scanner.nextLine();
		UserMainCode.removeEvenVowels(given);
		
	}

}
