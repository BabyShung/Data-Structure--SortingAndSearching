package FundamentalSearchings;

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

		while (true) {

			if (f > r)
				return -1;

			m = (f + r) / 2;

			if (k == arr[m])
				return m;
			else if (k < arr[m])
				r = m - 1;
			else
				f = m + 1;
		}

	}

}
