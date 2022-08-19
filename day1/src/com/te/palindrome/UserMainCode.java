package com.te.palindrome;

public class UserMainCode {
	public static int addPalindrome(int a, int b) {

		int pSum = 0;
		for (int i = a; i <= b; i++) {
			int tempa = i;
			int t = i;
			int sum = 0;
			while (t > 0) {

				sum = sum * 10 + t % 10;
				t = t / 10;
			}

			if (sum == tempa) {
				pSum = pSum + sum;
			}
		}
		// System.out.println(pSum);

		return pSum;
	}

}
