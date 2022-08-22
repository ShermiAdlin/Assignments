package om.te.boundaryaverage;

public class UserMainCode {
	public static float getBoundaryAverage(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		float average = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];

			}
		}
		for (int j = 0; j < arr.length; j++) {

			if (arr[j] < min) {
				min = arr[j];
			}

		}
		System.out.println("largest is " + max);
		System.out.println("smallest is " + min);

		 average = (float) (max + min) / 2;
		return average;
	}

}
