import FundamentalSearchings.BinarySearch;
import FundamentalSearchings.QuickSelect;
import FundamentalSortings.BubbleSort;
import FundamentalSortings.MergeSort;
import FundamentalSortings.QuickSort;
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

		// int[] arr = { 5, 6, 7, 8, 1, 2, 3, 4 };
		// RotatedBinarySearch rbs = new RotatedBinarySearch();
		// System.out.println(rbs.binarySearch(arr, 0, arr.length - 1, 3));

		// LinkedListSorting lls = new LinkedListSorting(1000000);
		// //System.out.println(lls);
		// lls.sortLinkedList();
		// lls.sortLinkedList2();

		char[] arr;
		 BubbleSort bs = new BubbleSort();
		 arr = bs.bubbleSort("3474281112000910acb");
		 System.out.print("BS: ");
		 for (int j = 0; j < arr.length; j++) {
		 System.out.print(arr[j] + " ");
		 }
		 System.out.println();
		 arr = bs.bubbleSort2("3474281112000910acb");
		 System.out.print("BS2: ");
		 for (int j = 0; j < arr.length; j++) {
		 System.out.print(arr[j] + " ");
		 }
		 System.out.println();
		 arr = bs.bubbleSort3("3474281112000910acb");
		 System.out.print("BS3: ");
		 for (int j = 0; j < arr.length; j++) {
		 System.out.print(arr[j] + " ");
		 }
		 System.out.println();

		SelectionSort ss = new SelectionSort();
		System.out.print("SS: ");
		arr = ss.selectionSort("3474281112000910acb");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
		System.out.print("SS2: ");
		arr = ss.selectionSort2("3474281112000910acb");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();

		// InsertionSort is = new InsertionSort();
		// arr = is.insertionSort3("3474281112000910acb");
		// for (int j = 0; j < arr.length; j++) {
		// System.out.print(arr[j] + " ");
		// }
		// System.out.println();
		 
		 
		 
		 
		 MergeSort ms = new MergeSort();
		 arr = ms.mergeSort("3474281112000910acb");
		 System.out.print("MS: ");
		 for (int j = 0; j < arr.length; j++) {
		 System.out.print(arr[j] + " ");
		 }
		 System.out.println();
		 
		 
		 
		 
		 QuickSort qs = new QuickSort();
		 arr = qs.quickSort("3474281112000910acb");
		 System.out.print("QS: ");
		 for (int j = 0; j < arr.length; j++) {
		 System.out.print(arr[j] + " ");
		 }
		 System.out.println();
		 
		 
		 

		// SortedArrayInterspersed_11_5 sai = new
		// SortedArrayInterspersed_11_5();
		// String[] strs= {"ab","","","bce","","","","ea","ef"};
		// System.out.println(sai.MutatedBinarySearch(strs, "ef"));

		BinarySearch bsea = new BinarySearch();
		int[] bsarr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 23 };
		int index = bsea.binarySearch(bsarr, 23);
		System.out.println("return index: " + index);
		index = bsea.binarySearchIterative(bsarr, 23);
		System.out.println("return index: " + index);
		
		int[] qsarr = { 6,4,9,10,30,15};
		QuickSelect qse = new QuickSelect();
		int KthEle = qse.selectKth(qsarr, 1);
		System.out.println("-------Kth element is: "+ KthEle);
		
		int[] qsarr2 = { 10,2,6,4,8 };
		int KthEleRec = qse.selectKthRec(qsarr2, 2 );
		System.out.println("KthRec element is: "+ KthEleRec);
		
		
	}

}
