package FundamentalSortings;

/**
 * Bubble Sort
 * keep on comparing and swapping
 * 
 * 
 * @author haozheng
 *
 */
public class BubbleSort {

	public char[] bubbleSort(String a) {
		char[] arr = a.toCharArray();
		
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				if (arr[j - 1] > arr[j]) {
					swap(arr,j,j-1);
				}
			}
		}
		return arr;
	}
	
	public char[] bubbleSort2(String a) {
		char[] arr = a.toCharArray();
		
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j ] > arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
		return arr;
	}
	

	private void swap(char[] arr, int j, int i) {
		char tmp = arr[j];
		arr[j] = arr[i];
		arr[i] = tmp;
	}
 
}
