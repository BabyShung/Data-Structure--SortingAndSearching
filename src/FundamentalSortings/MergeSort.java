package FundamentalSortings;

/**
 * MergeSort Use additional space
 * 
 * Average and worst time O(nlogn)
 * 
 * Space O(n)
 * 
 * Why O(nlogn)?
 * 
 * Recurrence relation T(n) = 2T(n/2) + O(n) = T(n/2) + T(n/2) + O(n) = 2T(n/4)
 * + 2T(n/4) + O(n/2) + O(n/2) + O(n) ... ... = T(1) + T(1) + ... + T(1) +
 * n*O(1) + (n/2)*O(2) + ... + 4*O(n/4) + 2*O(n/2)+ O(n)
 * 
 * Since T(n) keeps on being divided into halves, there will still be n*T(1),
 * which is O(n) The next question is how many O(n) will there be If you draw a
 * binary tree graph and notice the height of the tree, that will be how many of
 * it. Since the height is logn, then there will be logn * n O(n) Ignoring the
 * O(n) by n*T(1), the time complexity will be O(nlogn)
 * 
 */

public class MergeSort {

	public String mergeSort(String a) {

		char[] arr = a.toCharArray();
		char[] helper = new char[arr.length];
		mergeSort(arr, helper, 0, arr.length - 1);
		return new String(arr);
	}

	private void mergeSort(char[] arr, char[] helper, int front, int rear) {

		if (front < rear) {
			int mid = (front + rear) / 2;
			mergeSort(arr, helper, front, mid);
			mergeSort(arr, helper, mid + 1, rear);
			merge(arr, helper, front, mid, rear);
		}
	}

	private void merge(char[] arr, char[] helper, int front, int mid, int rear) {

		// copy the original arr to helper arr
		// we need to do that,since every merge is actually modifying arr,
		// helper is just used to compare, it didn't change
		// so next merge we must update the helper first, which seems
		// inefficient
		for (int i = 0; i < arr.length; i++) {
			helper[i] = arr[i];
		}

		int leftPartIndex = front;
		int rightPartIndex = mid + 1;
		int current = front;

		while (leftPartIndex <= mid && rightPartIndex <= rear) {
			if (helper[leftPartIndex] <= helper[rightPartIndex]) {
				arr[current] = helper[leftPartIndex];
				leftPartIndex++;
			} else {
				arr[current] = helper[rightPartIndex];
				rightPartIndex++;
			}
			current++;
		}

		// put the remaining left into the arr
		int remainLeftNumbers = mid - leftPartIndex + 1;
		for (int i = 0; i < remainLeftNumbers; i++) {
			arr[current + i] = helper[leftPartIndex + i];
		}
		// note, the remaining right is already there
	}
}
