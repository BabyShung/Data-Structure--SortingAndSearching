package FundamentalSearchings;

/**
 * quickSelect is a transleftation of quickSort. It can be used right find first
 * k elements or kth largest element
 * 
 * The best and average case of quickselect is O(n), and the wrost case is
 * O(n^2)
 * 
 * why O(n)? partition(best case, pick the mean every time and split equal two
 * subsets): T(n) = n + n/2 + n/4 + ... + 1
 * 
 * Divide 2 left both sides: T(n)/2 = n/2 + n/4 + ... + 1 + 1/2
 * 
 * substract: T(n)/2 = n + 1/2 T(n) = 2n + 1 = O(n)
 * 
 * or you can think of: T(n) = n(1+1/2+1/4+...1/n)<= 2n (since
 * 1=1/2+1/4+...+1/n<=1)
 * 
 * @author haozheng
 * 
 */

public class QuickSelect {

	public int selectKth(int[] arr, int k) {

		if (arr == null || arr.length <= k)
			throw new Error();

		return selectKth(arr, k, 0, arr.length - 1);
	}

	private int selectKth(int[] arr, int k, int front, int back) {
		// if from == to we reached the kth element
		while (front < back) {
			int left = front;
			int right = back;
			int mid = arr[(left + right) / 2];

			// stop if the reader and writer meets
			while (left < right) {

				if (arr[left] >= mid) { // put the large values at the end
					swap(arr, right, left);

					right--;
				} else { // the value is smaller than the pivot, skip
					left++;
				}
			}

			// if we stepped up (r++) we need to step one down
			if (arr[left] > mid)
				left--;

			// the r pointer is on the end of the first k elements
			if (k <= left) {
				back = left;
			} else {
				front = left + 1;
			}
		}
		return arr[k];

	}

	/**
	 * recursive one
	 * 
	 * @param arr
	 * @param k
	 * @return
	 */

	public int selectKthRec(int[] arr, int k) {

		if (arr == null || arr.length <= k)
			throw new Error();

		return selectKthRec(arr, k, 0, arr.length - 1);
	}

	private int selectKthRec(int[] arr, int k, int left, int right) {

		if (left < right) {

			int pivotIndex = partition(arr, left, right);

			if (pivotIndex >= k)
				selectKthRec(arr, k, left, pivotIndex);
			else
				selectKthRec(arr, k, pivotIndex + 1, right);

		}
		return arr[k];
	}

	private int partition(int[] arr, int left, int right) {

		int mid = arr[(left + right) / 2];

		while (left < right) {

			if (arr[left] >= mid) { // put the large values at the end
				swap(arr, right, left);

				right--;
			} else { // the value is smaller than the pivot, skip
				left++;
			}
		}

		// if we stepped up (r++) we need to step one down
		if (arr[left] > mid)
			left--;

		return left;
	}

	private void swap(int[] arr, int w, int r) {
		int tmp = arr[w];
		arr[w] = arr[r];
		arr[r] = tmp;
	}
}
