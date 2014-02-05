package applications;

/**
 * Finding intersection of two sorted arrays
 * 
 * sol1: bruteforce O(m*n)
 * sol2: binarySearch(making good use of sortedArray property, O(m*logn)
 * sol3: hashtable, put e.g all m into the ht, and for all n, search, O(m+n), 
 * not good when m is large, making the search in ht not constant
 * sol4: merge, two pointers, scan through both two arrays, O(m+n)
 * 
 * sol2 and 4 are preferable, but 4 is not always the best, it depends.
 * When n >> m, sol2 is better
 * 
 * 
 * 
 */

import FundamentalSearchings.BinarySearch;

public class TwoSorted_CheckIntersection {

	/**
	 * Notice: if input a,b are int array, the result array should better be int
	 * array If you define result using ArrayList<Integer>, it will cause boxing
	 * and if the size n is large, it will make performance worse.
	 * 
	 */

	public int[] getIntersection(int[] a, int[] b) {
		int iA = 0, iB = 0, iC = 0;

		int[] c = new int[a.length < b.length ? a.length : b.length];
		while (iA < a.length && iB < b.length) {
			if (a[iA] == b[iB]) {
				c[iC] = a[iA];
				iC++;
				iA++;
				iB++;
			} else if (a[iA] > b[iB]) {
				iB++;
			} else
				iA++;
		}

		// the result array needs to be processed, I skipped
		return c;

	}

	public int[] getIntersection_usingBinarySearch(int[] a, int[] b) {
		BinarySearch bs = new BinarySearch();

		int smallL;
		int[] smallR, largeR;

		if (a.length > b.length) {
			smallL = b.length;
			smallR = b;
			largeR = a;
		} else {
			smallL = a.length;
			smallR = a;
			largeR = b;
		}

		int[] c = new int[smallL];
		int searchI;
		int iC = 0;
		for (int i = 0; i < smallL; i++) {
			searchI = bs.binarySearch(largeR, smallR[i]);
			if (searchI != -1) {// found,intersected
				c[iC] = largeR[searchI];
				iC++;
			}
		}
		return c;

	}

}
