package FundamentalSortings;

public class InsertionSort {

	public char[] insertionSort(String a) {
		char[] arr = a.toCharArray();
		char tmp;
		int j;
		for (int i = 1; i < arr.length; i++) {
			tmp = arr[i];
			j = i;
			while (j > 0 && tmp < arr[j - 1]) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = tmp;

		}
		return arr;
	}

	public char[] insertionSort2(String a) {
		char[] arr = a.toCharArray();
		char tmp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				} else
					break;
			}
		}
		return arr;
	}

	public char[] insertionSort3(String a) {
		char[] arr = a.toCharArray();
		char tmp;
		for (int i = 1; i < arr.length; i++) {
			tmp = arr[i];
			for (int j = i; j > 0; j--) {
				if (tmp < arr[j - 1]) {
					arr[j] = arr[j - 1];

				} else {
					arr[j] = tmp;
					break;
				}

				if (j - 1 == 0)
					arr[j - 1] = tmp;
			}
		}
		return arr;
	}

}
