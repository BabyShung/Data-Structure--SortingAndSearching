package FundamentalSortings;

/**
 * Selection Sort It's like finding a min for n times A little faster than
 * bubble sort, since swap is fewer
 * 
 * classic way is not stable.
 * Also added a stable one, but it's inefficient
 * 
 * O(n^2)
 * @author haozheng
 * 
 */
public class SelectionSort {

	public String selectionSort(String a) {
		char[] arr = a.toCharArray();
		int minIndex;

		for (int i = 0; i < arr.length - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex])
					minIndex = j;
			}
			// swap
			swap(arr, minIndex, i);
		}
		return new String(arr);
	}

	/**
	 * alternative
	 */

	public String selectionSort2(String a) {
		char[] arr = a.toCharArray();
		for (int i = 0; i < arr.length - 1; i++) {
			swap(arr, i, getMinIndex(arr, i));
		}
		return new String(arr);
	}

	public String selectionSortStable(String s) {
		char[] a = s.toCharArray();
		for (int i = 0; i < a.length - 1; i++) {
			insert(a, i, getMinIndex(a, i));
		}
		return new String(a);
	}

	private void insert(char[] a, int i, int minIndex) {// O(n)+O(n)
		if (minIndex > i) {
			char tmp = a[minIndex];
			System.arraycopy(a, i, a, i + 1, minIndex - i);
			a[i] = tmp;
		}
	}

	/**
	 * helpers
	 * 
	 */

	private int getMinIndex(char[] arr, int i) {
		int minIndex = i;
		for (int j = i + 1; j < arr.length; j++) {
			if (arr[j] < arr[minIndex])
				minIndex = j;
		}
		return minIndex;
	}

	private void swap(char[] arr, int j, int i) {
		char tmp = arr[j];
		arr[j] = arr[i];
		arr[i] = tmp;
	}
}
