package applications;

/**
 * HARD Question:
 * 
 * Given a sorted array, and it might be rotated for a lot of times, search a
 * element and return its index or value
 * 
 * Hint: Using linear search is common --O(n) How to use O(logn) time to search?
 * 
 * No matter how many time it is rotated, it can be 1. the original one, 2. an
 * array that increases first, then reset, then increase again 3.there are a
 * couple of same elements --- this will reduce to O(n)
 * 
 * EG: 6 7 8 9 1 2 3 7 8 9 6 1 2 3 4
 * 
 * 
 * @author haozheng
 *
 */
public class RotatedBinarySearch {

	public int binarySearch(int[] arr, int left, int right, int k) {

		int mid = (left + right) / 2;
		if (k == arr[mid])
			return mid;
		if (left > right)
			return -1;

		if (arr[left] < arr[mid]) {// check left since left could be ascendent
			if (k >= arr[left] && k <= arr[mid]) // means left part is
													// ascendent, search left
				return binarySearch(arr, left, mid - 1, k);
			else
				// right part is ascendent
				return binarySearch(arr, mid + 1, right, k);// search right
		} else if (arr[left] > arr[mid]) { // check right since right could be
											// ascendent
			if (k >= arr[mid] && k <= arr[right]) // right ascendent, search
													// right
				return binarySearch(arr, mid + 1, right, k);
			else
				// left ascendent
				return binarySearch(arr, left, mid - 1, k); // search left
		} else if (arr[left] == arr[mid]) {

			// in this case, first if arr[mid] == arr[right]
			// IF so, left,mid,right are the same,
			// thus both left part and right part could be ascendent
			// so we have to search both

			// ELSE only left and mid the same, then right part is ascendent, so
			// search right

			// 2 3 4 2 2 2 2
			// 2 2 2 3 4 5

			if (arr[mid] != arr[right])
				return binarySearch(arr, mid + 1, right, k);
			else {
				int result = binarySearch(arr, left, mid - 1, k);
				if (result == -1)
					return binarySearch(arr, mid + 1, right, k);
				else
					return result;
			}
		}
		return -1;
	}

	public int rotatedBinarySearch(int[] A, int target) {

		int f = 0;
		int r = A.length - 1;
		int m;

		while (f <= r) {

			m = (f + r) / 2;

			if (A[m] == target) {
				return m;
			} else if ((A[f] < A[r] && A[m] < target)
					|| (A[m] < A[r] && target > A[m] && target <= A[r])
					|| (A[m] > A[r] && (target > A[m] || target <= A[r]))) {
				f = m + 1;
			} else {
				r = m - 1;
			}
		}

		return -1;

	}

}
