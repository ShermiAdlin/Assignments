package com.te.string_occurance;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the detailed word");
	String str1 = scanner.nextLine();
	System.out.println("Enter the repeated word");
	String str2 = scanner.nextLine();
	System.out.println(UserMainCode.getSubstring(str1,str2));
}
}
