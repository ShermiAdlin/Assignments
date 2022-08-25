package com.te.middlecharacters;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the word");
		String given = scanner.nextLine();
		if(given.length()%2 != 0)
		{
			System.out.println("odd length not accepted");
		}
		else {
			UserMainCode.getMiddleChars(given);
		}
	}

}
