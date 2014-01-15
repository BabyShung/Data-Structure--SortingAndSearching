import applications.sortAnagramsOfStringArray;

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

		sortAnagramsOfStringArray saosa = new sortAnagramsOfStringArray();
		String[] arr = { "abc", "oipqe", "bca", "cfgt", "jncik", "tcfg",
				"kijnc", "poieq" };
		saosa.sortAnagrams(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

}
