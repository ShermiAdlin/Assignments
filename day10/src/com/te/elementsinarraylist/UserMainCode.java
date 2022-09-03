package com.te.elementsinarraylist;

import java.util.ArrayList;
import java.util.List;

public class UserMainCode {
	public static int[] elements(List<Integer> list1, List<Integer>list2){
		List<Integer> list3 = new ArrayList<Integer>(list1);
		list3.removeAll(list2);
		List<Integer> list4 = new ArrayList<Integer>(list2);
		list4.removeAll(list1);
		
		list3.addAll(list4);
		int [] arr = new int[list3.size()];
		Object[] obj=list3.toArray();
		for (int i = 0; i < obj.length; i++) {
			arr[i]=(int)obj[i];
			
		}
		return arr;
	}

}
