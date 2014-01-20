package FundamentalSortings;

/**
 * MergeSort
 * 
 * Average and worst time O(nlogn)
 * 
 * Space O(n)
 * 
 * 
 */

public class MergeSort {

	public char[] mergeSort(String a) {
		char[] arr = a.toCharArray();
		char[] helper = new char[arr.length];
		
		return mergeSort(arr, helper, 0, arr.length - 1);
	}

	private char[] mergeSort(char[] arr, char[] helper, int front, int rear) {

		if (front < rear) {
			int mid = (front + rear) / 2;
			mergeSort(arr, helper, front, mid);
			mergeSort(arr, helper, mid + 1, rear);
			merge(arr, helper, front, mid, rear);
		}
		return arr;
	}

	private void merge(char[] arr, char[] helper, int front, int mid, int rear) {

		//copy the original arr to helper arr
		for (int i = 0; i < arr.length; i++) {
			helper[i] = arr[i];
		}

		int leftPartIndex = front;
		int rightPartIndex = mid + 1;
		int current = front;

		while (leftPartIndex <= mid && rightPartIndex <= rear) {
			if (helper[leftPartIndex] <= helper[rightPartIndex]) {
				arr[current] = helper[leftPartIndex];
				leftPartIndex++;
			} else {
				arr[current] = helper[rightPartIndex];
				rightPartIndex++;
			}
			current++;
		}

		int remain = mid - leftPartIndex + 1;
		for (int i = 0; i < remain; i++) {
			arr[current + i] = helper[leftPartIndex + i];
		}

	}
}
