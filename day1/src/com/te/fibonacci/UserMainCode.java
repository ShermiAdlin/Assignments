package com.te.fibonacci;

public class UserMainCode {
	public static int getSumOfNfibos(int a) {
		int n1 = 0, n2 = 1, n3 = 0, sum = 0;

		System.out.print(n1 + " ");
		for (int i = 1; i <= a; i++) {
			n3=n1+n2;
			System.out.print(n2+ " ");

			n1 = n2;
			n2 = n3;


			sum = sum + n1;

		}
		System.out.println();

		return sum;

	}

}
