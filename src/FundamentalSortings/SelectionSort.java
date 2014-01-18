package FundamentalSortings;

/**
 * Selection Sort
 * It's like finding a min for n times
 * A little faster than bubble sort, since swap is fewer
 * @author haozheng
 *
 */
public class SelectionSort {

	public char[] selectionSort(String a) {
		char[] arr = a.toCharArray();
		int minIndex;
		char tmp;
		for (int i = 0; i < arr.length - 1; i++) {
			minIndex = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[minIndex])
					minIndex = j;
			}
			// swap
			tmp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = tmp;
		}
		return arr;
	}
}
