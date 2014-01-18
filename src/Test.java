import FundamentalSortings.BubbleSort;
import FundamentalSortings.SelectionSort;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// ArrayMerge am = new ArrayMerge();
		// int[] a = { 1, 2, 9, 10, 13, -1, -1, -1, -1, -1, -1, -1 };
		// int[] b = {4,5,7,9,11,12,14};
		//
		// am.merge(a, b, 5, 7);
		// for(int i = 0; i<a.length;i++){
		// System.out.print(a[i]+" ");
		// }

		// int[] sa = {3,6,7,9,11,12,14,18,19,20,23};
		// OneSidedBinarySearch osbs = new OneSidedBinarySearch();
		// System.out.println(osbs.oneSidedBinarySearch(sa, 20));

		// sortAnagramsOfStringArray saosa = new sortAnagramsOfStringArray();
		// String[] arr = { "abc", "oipqe", "bca", "cfgt", "jncik", "tcfg",
		// "kijnc", "poieq" };
		// saosa.sortAnagrams(arr);
		// for (int i = 0; i < arr.length; i++)
		// System.out.print(arr[i] + " ");

//		int[] arr = { 5, 6, 7, 8, 1, 2, 3, 4 };
//		RotatedBinarySearch rbs = new RotatedBinarySearch();
//		System.out.println(rbs.binarySearch(arr, 0, arr.length - 1, 3));
		
//		LinkedListSorting lls = new LinkedListSorting(1000000);
//		//System.out.println(lls);
//		lls.sortLinkedList();
//		lls.sortLinkedList2();

		BubbleSort bs = new BubbleSort();
		char[] arr = bs.bubbleSort("3474281112000910acb");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
		
		SelectionSort ss = new SelectionSort();
		arr = ss.selectionSort("3474281112000910acb");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}

}
