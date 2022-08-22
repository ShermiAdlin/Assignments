package com.te.median;

public class UserMainCode {

		public static int findMedian(int[] array) {
			int temp = 0;
			int median;
			int median1;

			for (int i = 0; i < array.length - 1; i++) {
				for (int j = 0; j < array.length - 1 - i; j++) {
					if (array[j] > array[j + 1]) {
						temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}
			System.out.println("The sorted element of the array is :");
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
			
			if ((array.length%2)!=0) {
				median=(array.length/2)+1;
				median1=array[median-1];
			}
			else {
				median=((array.length/2));
				median1=array[median]+array[median-1];
				
			}
			return median1;
		}

	}

