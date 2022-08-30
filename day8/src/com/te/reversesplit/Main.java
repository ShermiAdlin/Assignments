package com.te.reversesplit;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("enter the string");
		 String given = scanner.nextLine();
		 System.out.println("enter the character");
		 char ch = scanner.next().charAt(0);
		 UserMainCode.reShape(given,ch);
	}

}
