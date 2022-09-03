package com.te.matchcharacter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserMainCode {
	public static ArrayList<String> matchCharacter(List list, int size) {
		ArrayList<String> list1 = new ArrayList<String>();

		for (int i = 0; i < size; i++) {
			String str = (String) list.get(i);

			char first = str.charAt(0);
			char last = str.charAt(str.length() - 1);

			if ((first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u')
					&& (last == 'a' || last == 'e' || last == 'i' || last == 'o' || last == 'u')) {
				list1.add(str);

			}

		}
		return list1;

	}

}
