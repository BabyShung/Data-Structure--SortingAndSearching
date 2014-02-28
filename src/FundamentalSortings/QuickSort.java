package FundamentalSortings;

/**
 * QuickSort
 * 
 * average O(nlogn), worst O(n^2)
 * 
 * space O(logn) (if stack occupancy is not considered --- keep on being divided
 * by 2
 * 
 * 
 * Note that the partition method picks the middle element every time. Actually
 * we don't know what the mid ele is. If it is the mean, it will be great since
 * it can partition best for the array. If it is the min or the max, it will be
 * bad after partition
 * 
 * The best lies if the original array is distributed uniformly
 * 
 * From experiments, it showed that qsort is faster than mergesort, using less
 * operations and space, if the elements are distributed uniformly.
 * However, for large number of input, mergesort is better.
 * Actually parallel computing for sorting large set is the best
 * 
 */
public class QuickSort {

	public String quickSort(String a) {
		char[] arr = a.toCharArray();
		quickSort(arr, 0, arr.length - 1);
		return new String(arr);
	}

	private void quickSort(char[] arr, int left, int right) {
		// partition and get the pivot index
		int pivotIndex = partition(arr, left, right);

		// once get the pivot index, still need to recursively partition left
		// and right
		if (left < pivotIndex - 1) // at least of size 2
			quickSort(arr, left, pivotIndex - 1);
		if (right > pivotIndex)
			quickSort(arr, pivotIndex, right);
	}

	private int partition(char[] arr, int left, int right) {

		char pivotEle = arr[(left + right) / 2];
		while (left <= right) {
			while (arr[left] < pivotEle)
				left++;
			while (arr[right] > pivotEle)
				right--;

			if (left <= right) {
				swap(arr, left, right);
				left++;
				right--;
			}
		}

		return left;
	}

	/**
	 * PS: 1.if left = right, it will still swap, waste of code
	 * 
	 * 2.use a number that is not in the array to partition will cause
	 * arrayOutOfBound, but this is an optimazised version, since we fix the
	 * middle one as the pivot every time
	 */

	private void swap(char[] arr, int left, int right) {
		char tmp = arr[left];
		arr[left] = arr[right];
		arr[right] = tmp;
	}
}
