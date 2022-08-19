package com.te.evenOddIdex;

public class UserMainCode {
	public static int sumOfOddEvenPositioned(int num) {
		int count = 0;
		int last = 0;
		int sumOdd = 0;
		int temp = num;
		int sumeve = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		while (temp > 0) {
			if (count % 2 == 0) {
				last = temp % 10;
				sumOdd = sumOdd + last;
				temp = temp / 10;
			} else if (count % 2 != 0) {
				last = temp % 10;
				sumeve = last + sumeve;
				temp = temp / 10;
			}
			count--;

		}

		System.out.println("sum of odd index : " + sumOdd);
		System.out.println("sum of even index: " + sumeve);
		if (sumOdd == sumeve)
			return 1;
		else
			return -1;
	}

}
