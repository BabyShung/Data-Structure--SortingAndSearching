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
 
		for (int i = 0; i < arr.length - 1; i++) {
			minIndex = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex])
					minIndex = j;
			}
			// swap
			swap(arr,minIndex,i);
		}
		return arr;
	}
	
	/**
	 * alternative
	 */
	
	public char[] selectionSort2(String a) {
		char[] arr = a.toCharArray();
		for (int i = 0; i < arr.length - 1; i++) {
			swap(arr,i,getMinIndex(arr,i));
		}
		return arr;
	}
	
	/**
	 * helpers
	 * 
	 */
	
	private int getMinIndex(char[] arr, int i) {
		int minIndex = i;
		for (int j = i+1; j < arr.length; j++) {
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
