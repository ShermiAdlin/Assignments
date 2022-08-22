package sumandduplicateelements;

public class UserMainCode {
	public static int sumElements(int array[]) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j])
					array[j] = 0;

			}

		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0 && array[i] != 0) {
				sum = sum + array[i];
			}
		}
			return sum;
		
	}
	
}
