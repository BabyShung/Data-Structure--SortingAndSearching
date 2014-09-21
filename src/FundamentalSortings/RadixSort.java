package FundamentalSortings;

/**
 * RadixSort  --- different from bucket sort
 * 
 * Bucket sort just scans through one time and put the current data into the corresponding bucket.
 * After the scan it will just combine the every linked list in the bucket.
 * 
 * While radixsort focuses on every digit, and copy them to a new array.
 * After process, then copy them back. And keep on repeating the same process for different digit.
 * Technically, bucketsort is efficient than radixsort.
 * 
 */

import java.util.LinkedList;
import java.util.Queue;

public class RadixSort {

	public void radixSort(int[] data) {
		boolean flag = true;
		int divisor = 1;
		Queue<Integer>[] buckets = new Queue[10];
		for (int i = 0; i < 10; i++)
			buckets[i] = new LinkedList<Integer>();

		while (flag) {
			flag = false;
			// first copy the values into buckets array
			for (int i = 0; i < data.length; i++) {
				int hashIndex = (data[i] / divisor) % 10;
				if (hashIndex > 0)
					flag = true;
				buckets[hashIndex].add(new Integer(data[i]));
			}
			// then copy the values back into array
			divisor *= 10;
			int i = 0;
			for (int j = 0; j < 10; j++) {
				while (!buckets[j].isEmpty()) {
					Integer ival = (Integer) buckets[j].poll();
					data[i++] = ival.intValue();
				}
			}
		}
	}
}
