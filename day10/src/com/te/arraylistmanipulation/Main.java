package com.te.arraylistmanipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		System.out.println("Enter the size ");
		int size =scanner.nextInt();
		System.out.println("Enter the first array");
		for (int i = 0; i < size; i++) {
			list1.add(scanner.nextInt());
			
		}
		System.out.println("Enter the second array");
		for (int i = 0; i < size; i++) {
			list2.add(scanner.nextInt());
			
		}
		System.out.println(UserMainCode.generateOddEvenList(list1,list2,size));
	}

}
