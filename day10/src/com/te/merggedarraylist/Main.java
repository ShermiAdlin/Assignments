package com.te.merggedarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = 5;
		List<Integer> list1 = new ArrayList<Integer>();
		List< Integer> list2 = new ArrayList<Integer>();
		System.out.println("Enter the first array list");
		for (int i = 0; i < size; i++) {
			list1.add(scanner.nextInt());
			
		} 
		System.out.println("Enter the second array list");
		for (int i = 0; i < size; i++) {
			list2.add(scanner.nextInt());
		}
		System.out.println(UserMainCode.sortMergedArrayList(list1,list2));
		
	}

}
