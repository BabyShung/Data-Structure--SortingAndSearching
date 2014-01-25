package FundamentalSearchings;

public class BinarySearch {

	
	//recursive one
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

}
