package com.te.converttostring;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UserMainCode {
	public static String[] convertToStringArray(List list, int size) {
		Collections.sort(list);

		String[] arr = new String[list.size()];
		list.toArray(arr);
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);

		}
		return arr;

	}
}
