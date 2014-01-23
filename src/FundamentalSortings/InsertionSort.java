package FundamentalSortings;

/**
 * sol1 is the classic solution
 * 
 * sol2 is a little bit inefficient ,since it swaps elements more
 * 
 * sol3 is similar to 1, might not be that concise as 1
 * 
 * 
 * @author haozheng
 *
 */

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

	//not the most efficient
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
				//this case is when a element swap from current all to the first place
				if (j - 1 == 0)
					arr[j - 1] = tmp;
			}
		}
		return arr;
	}

}
