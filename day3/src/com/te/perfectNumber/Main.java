package com.te.perfectNumber;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("Enter the number");
	int given=scanner.nextInt();
	System.out.println(UserMainCode.getPerfection(given));
		
}
}
