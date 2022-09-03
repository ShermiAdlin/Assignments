package com.te.merggedarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserMainCode {
	public static ArrayList<Integer> sortMergedArrayList(List list1,List list2) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list1.addAll(list2);
		System.out.println("After merging : "+list1);
		Collections.sort(list1);
		System.out.println("After sorting : "+list1);
		Integer element2 =  (Integer) list1.get(2);
		Integer element6 = (Integer) list1.get(6);
		Integer element8 = (Integer) list1.get(8);
		list.add(element2);
		list.add(element6);
		list.add(element8);
		return list;
		
		
		
		
		
	}

}
