package com.te.elementsinarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List <Integer>list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		System.out.println("Enter the size of first array");
		int size1 = scanner.nextInt();
		System.out.println("Enter the first element array");
		for (int i = 0; i < size1; i++) {
			list1.add(scanner.nextInt());
			
		}
		System.out.println("Enter the size of second array");
		int size2 = scanner.nextInt();
		System.out.println("Enter the second array list");
		for (int i = 0; i < size2; i++) {
			list2.add(scanner.nextInt());
			
		}
		int num[]=UserMainCode.elements(list1,list2);
		Arrays.sort(num);
		for (int i : num) {
			System.out.println(i);
			
		}
	}

}
