package com.te.newword;


	public class UserMainCode {

		static int getElementsPosition(String[] sarr, String str) {
			String narr[] = new String[sarr.length];
			for (int i = 0; i < narr.length; i++) {
				narr[i] = sarr[narr.length - i - 1];
			}

			int res = 0;
			for (int i = 0; i < narr.length; i++) {
				if (narr[i].equals(str))
					res = i + 1;
			}
		return res;
				}
		
	}
