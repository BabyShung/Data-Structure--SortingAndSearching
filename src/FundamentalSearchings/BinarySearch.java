package FundamentalSearchings;

/**
 * Binary Search--
 * 
 * return "index"
 * 
 * binary search is really important for searching in a sorted array, given a
 * question to search something, notice if the data is sorted. Anyway, first
 * point out if there exists a linear search, then the bs search --O(logn)
 * 
 * 1. recursive 2. iterative --- usually more efficient
 * 
 * @author haozheng
 * 
 */

public class BinarySearch {

	// recursive one
	public int binarySearch(int arr[], int k) {
		return binarySearchRec(arr, k, 0, arr.length - 1);
	}

	private int binarySearchRec(int[] arr, int k, int f, int r) {
		
		if (f <= r) {

			int m = (f + r) / 2;
			if (k == arr[m])
				return m;
			else if (k < arr[m])
				return binarySearchRec(arr, k, f, m - 1);
			else
				return binarySearchRec(arr, k, m + 1, r);
		}
		return -1;
	}

	// iterative one
	public int binarySearchIterative(int[] arr, int k) {
		int f = 0;
		int r = arr.length - 1;
		int m;

		while (f<=r) {

			m = (f + r) / 2;

			if (k == arr[m])
				return m;
			else if (k < arr[m])
				r = m - 1;
			else
				f = m + 1;
		}
		return -1;
	}

}
