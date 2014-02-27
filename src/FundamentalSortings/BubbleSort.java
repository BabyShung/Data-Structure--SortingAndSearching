package FundamentalSortings;

/**
 * Bubble Sort 
 * 
 * keep on comparing and swapping
 * O(n^2)
 * 
 * 
 * @author haozheng
 * 
 */
public class BubbleSort {

	public String bubbleSort(String a) {
		char[] arr = a.toCharArray();
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 1; j <= i; j++) { // notice
				if (arr[j - 1] > arr[j]) {
					swap(arr, j, j - 1);
				}
			}
		}
		return new String(arr);
	}

	public String bubbleSort2(String a) {
		char[] arr = a.toCharArray();
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) { // notice
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}
		return new String(arr);
	}

	public String bubbleSort3(String a) {
		char[] arr = a.toCharArray();

		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}
			}
		}
		return new String(arr);
	}

	private void swap(char[] arr, int j, int i) {
		char tmp = arr[j];
		arr[j] = arr[i];
		arr[i] = tmp;
	}

}
