package com.te.arraylistmanipulation;

import java.util.ArrayList;
import java.util.List;

public class UserMainCode {
	public static List<Integer> generateOddEvenList(List list1, List list2, int size){
		List list3= new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			if(i%2!=0) {
			  list3.add(list1.get(i));
			
			}
			else if(i%2==0) {
			list3.add(list2.get(i));
			
			}
			
		}
	
		return list3;
	}

}
