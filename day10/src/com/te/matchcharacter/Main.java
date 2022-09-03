package com.te.matchcharacter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List< String> list = new ArrayList<String>();
		System.out.println("Enter the size");
		int size = scanner.nextInt();
		System.out.println("Enter the names");
		for (int i = 0; i < size; i++) {
			list.add(scanner.next());
			
		}
		System.out.println(list);
		System.out.println(UserMainCode.matchCharacter(list, size));
	}

}
