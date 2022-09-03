package com.te.threemultiples;

import java.util.ArrayList;
import java.util.List;

public class UserMainCode {
public static List<Integer> removeMultiplesOfThree(List list ,int size){
	//ArrayList<Integer> list1=new  ArrayList();
	for (int i = 2; i <list.size(); i+=2) {
		
			list.remove(i);
		
		
		
	}
	return list;
}
}
