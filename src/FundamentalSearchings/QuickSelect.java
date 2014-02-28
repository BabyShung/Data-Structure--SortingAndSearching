package FundamentalSearchings;

/**
 * quickSelect is a transformation of quickSort. It can be used to find first k
 * elements or kth largest element
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
 * 
 * There are two kinds of solutions, one iterative one recursive PS: This
 * partition method is somewhat different, it first picks the middle one as
 * pivot and then really partition all the array based on this element.
 * 
 * The other partition method in my quicksort file is somewhat wierd, every
 * time, not really fully partition the array.
 * 
 * 
 * 
 * @author haozheng
 * 
 */

public class QuickSelect {

	public int selectKth(int[] arr, int k) {

		// "k"th is the order in array (0th to n-1th), so need to substract one
		// (1st to nth)
		k--;

		if (arr == null || arr.length <= k || k < 0)
			throw new Error("check key and arr!");

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

			// if we stepped up (left++) we need to step one down
			if (arr[left] > mid)
				left--;

			// the left pointer is on the end of the first k elements
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
	 */

	public int selectKthRec(int[] arr, int k) {

		// "k"th is the order in array (0th to n-1th), so need to substract one
		// (1st to nth)
		k--;

		if (arr == null || arr.length <= k || k < 0)
			throw new Error("check key and arr");

		return selectKthRec(arr, k, 0, arr.length - 1);
	}

	private int selectKthRec(int[] arr, int k, int left, int right) {

		if (left < right) {

			int pivotIndex = partitionQS(arr, left, right);

			if (pivotIndex - 1 >= k)
				selectKthRec(arr, k, left, pivotIndex - 1);
			else
				selectKthRec(arr, k, pivotIndex, right);

		}
		return arr[k];
	}

	private int partitionQS(int[] arr, int left, int right) {

		int pivotEle = arr[(left + right) / 2];
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

	private void swap(int[] arr, int w, int r) {
		int tmp = arr[w];
		arr[w] = arr[r];
		arr[r] = tmp;
	}

	// private int partition(int[] arr, int left, int right) {
	//
	// int mid = arr[(left + right) / 2];
	//
	// while (left < right) {
	//
	// if (arr[left] >= mid) { // put the large values at the end
	// swap(arr, right, left);
	//
	// right--;
	// } else { // the value is smaller than the pivot, skip
	//
	// //----
	// left++;
	//
	// }
	// }
	//
	// // if we stepped up (r++) we need to step one down
	// if (arr[left] > mid){
	// left--;
	// }
	//
	// return left;
	// }

}
