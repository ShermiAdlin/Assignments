package com.te.converttostring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	List<String> list = new ArrayList<String>();
	System.out.println("Enter the array size");
	int size = scanner.nextInt();
	System.out.println("enter the string");
	for (int i = 0; i < size; i++) {
		list.add(scanner.next());
		
	}
	UserMainCode.convertToStringArray( list, size);
}
}
