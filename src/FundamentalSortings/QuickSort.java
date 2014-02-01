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
 * From experiments, it showed that if qsort is faster than mergesort, less
 * operations and space, if the elements are distributed uniformly.
 * 
 */
public class QuickSort {

	public char[] quickSort(String a) {
		char[] arr = a.toCharArray();
		return quickSort(arr, 0, arr.length - 1);
	}

	private char[] quickSort(char[] arr, int left, int right) {
		// partition and get the pivot index
		int pivotIndex = partition(arr, left, right);

		// once get the pivot index, still need to recursively partition left
		// and right
		if (left < pivotIndex - 1) // at least of size 2
			quickSort(arr, left, pivotIndex - 1);
		if (right > pivotIndex)
			quickSort(arr, pivotIndex, right);
		return arr;
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

	private int partition2(char[] arr, int left, int right) {
		// testing
		char pivotEle = arr[(left + right) / 2];
		while (left <= right) {
			while (arr[left] < pivotEle)
				left++;
			while (arr[right] > pivotEle)
				right--;

			/*
			 * PS: 1.if left = right, it will still swap, waste of code
			 * 
			 * 2.use a number that is not in the array to partition will cause
			 * arrayOutOfBound, but this is an optimazised version, since we fix
			 * the middle one as the pivot every time
			 */

			if (left < right) {
				System.out.println("swapped: " + arr[left] + " and "
						+ arr[right]);
				swap(arr, left, right);
				left++;
				right--;
			}
		}
		System.out.println("return pivotIndex: " + left);
		System.out.print("after partition: ");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
		return left;
	}

	private void swap(char[] arr, int left, int right) {
		char tmp = arr[left];
		arr[left] = arr[right];
		arr[right] = tmp;
	}
}
