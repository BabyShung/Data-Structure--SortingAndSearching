package applications;

/**
 * no idea what it does,gotta review binary search and quicksort first
 * 
 * O(logn)
 * 
 * 
 * @author haozheng
 * 
 */

public class SortedArrayInterspersed_11_5 {

	public int MutatedBinarySearch(String[] strs, String str) {
		if (str == null || str == null || str == "")
			return -1;
		return searchRec(strs, str, 0, strs.length - 1);
	}

	private int searchRec(String[] strs, String str, int first, int last) {

		if (first > last)
			return -1;

		int mid = (first + last) / 2;
		if (strs[mid].isEmpty()) {
			int left = mid - 1;
			int right = mid + 1;
			while (true) {
				if (left < first && right > last) {
					return -1;
				} else if (right <= last && !strs[right].isEmpty()) {
					mid = right;
					break;
				} else if (left >= first && !strs[left].isEmpty()) {
					mid = left;
					break;
				}
				right++;
				left--;
			}
		}

		if (str.equals(strs[mid])) {
			return mid;
		} else if (strs[mid].compareTo(str) < 0) {
			return searchRec(strs, str, mid + 1, last);
		} else
			return searchRec(strs, str, first, mid - 1);
	}
}
