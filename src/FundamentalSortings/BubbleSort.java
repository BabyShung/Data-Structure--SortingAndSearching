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
		char tmp;
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				if (arr[j - 1] > arr[j]) {
					tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				}
			}
		}
		return arr;
	}
 
}
