package FundamentalSortings;

public class QuickSort {

	public char[] quickSort(String a) {
		char[] arr = a.toCharArray();
		return quickSort(arr, 0, arr.length - 1);
	}

	private char[] quickSort(char[] arr, int left, int right) {

		int pivotIndex = partition(arr, left, right);
		if (left < pivotIndex - 1)
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
			while (pivotEle < arr[right])
				right--;

			if (left <= right) {
				swap(arr, left, right);
				left++;
				right--;
			}
		}
		return left;
	}

	private void swap(char[] arr, int left, int right) {
		char tmp = arr[left];
		arr[left] = arr[right];
		arr[right] = tmp;
	}
}
