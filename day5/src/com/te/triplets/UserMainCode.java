package com.te.triplets;

public class UserMainCode {
	public static boolean checkTriplets(int array[]) {
		
			boolean result = false;
			for (int i = 0; i < array.length - 2; i++) {
				if (array[i] == array[i + 1])
					if (array[i + 1] == array[i + 2])
						result = true;
			}
			return result;

	}

}
