import FundamentalSortings.MergeSort;
import applications.RotatedBinarySearch;

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

		 int[] arr = { 5, 6, 7, 8, 1, 2, 3, 4 };
		 //int[] arr = { 5, 1, 3 };
		 RotatedBinarySearch rbs = new RotatedBinarySearch();
		 //System.out.println(rbs.binarySearch(arr, 0, arr.length - 1, 3));
		 System.out.println(rbs.rotatedBinarySearch(arr, 3));
		 
		 
		// LinkedListSorting lls = new LinkedListSorting(1000000);
		// //System.out.println(lls);
		// lls.sortLinkedList();
		// lls.sortLinkedList2();

//		BubbleSort bs = new BubbleSort();
//		System.out.println("BS: " + bs.bubbleSort("3474281112000910acb"));
//		System.out.println("BS2: " + bs.bubbleSort2("3474281112000910acb"));
//		System.out.println("BS3: " + bs.bubbleSort3("3474281112000910acb"));
//
//		SelectionSort ss = new SelectionSort();
//		System.out.println("SS: " + ss.selectionSort("3474281112000910acb"));
//		System.out.println("SS2: " + ss.selectionSort2("3474281112000910acb"));
//		System.out.println("SS stable: " + ss.selectionSortStable("3474281112000910acb"));
//
//		InsertionSort is = new InsertionSort();
//		System.out.println("IS: " + is.insertionSort3("3474281112000910acb"));
//
		MergeSort ms = new MergeSort();
		System.out.println("MS: " + ms.mergeSort("3474281112000910acb"));
//
//		QuickSort qs = new QuickSort();
//		System.out.println("QS: " + qs.quickSort("3474281112000910acb"));

		// SortedArrayInterspersed_11_5 sai = new
		// SortedArrayInterspersed_11_5();
		// String[] strs= {"ab","","","bce","","","","ea","ef"};
		// System.out.println(sai.MutatedBinarySearch(strs, "ef"));

//		BinarySearch bsea = new BinarySearch();
//		int[] bsarr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 23 };
//		int index = bsea.binarySearch(bsarr, 4);
//		System.out.println("return index: " + index);
//		index = bsea.binarySearchIterative(bsarr, 4);
//		System.out.println("return index: " + index);
//
//		int[] qsarr = { 6, 4, 9, 10, 30, 15 };
//		QuickSelect qse = new QuickSelect();
//		int KthEle = qse.selectKth(qsarr, 1);
//		System.out.println("-------Kth element is: " + KthEle);
//
//		int[] qsarr2 = { 4, 2, 5, 8, 9, 1 };
//		int KthEleRec = qse.selectKthRec(qsarr2, 6);
//		System.out.println("KthRec element is: " + KthEleRec);
//
//		TwoSorted_CheckIntersection tsci = new TwoSorted_CheckIntersection();
//		int[] tscia = { 3, 6, 7, 9, 11, 12, 14, 18, 19, 20, 23 };
//		int[] tscib = { 2, 3, 10, 13, 14, 17, 18 };
//		int[] tscic = tsci.getIntersection(tscia, tscib);
//		for (int i = 0; i < tscic.length; i++) {
//			System.out.print(tscic[i] + " ");
//		}
//		System.out.println();
//
//		MultiKeySort mks = new MultiKeySort();
//		mks.Sort();
//		System.out.println("-----");
//		mks.Sort2();
//		
//		RadixSort rs = new RadixSort();
//		int[] rsarr = { 3, 66, 887, 139, 101, 12, 14, 18, 19, 20, 23 };
//		rs.radixSort(rsarr);
//		System.out.print("Radix Sort:  ");
//		for (int tmp: rsarr) {
//			System.out.print(tmp + " ");
//		}
//		System.out.println();
		
	}
}
