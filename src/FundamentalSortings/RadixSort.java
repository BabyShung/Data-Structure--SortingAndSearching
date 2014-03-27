package FundamentalSortings;

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
			// first copy the values into buckets
			for (int i = 0; i < data.length; i++) {
				int hashIndex = (data[i] / divisor) % 10;
				if (hashIndex > 0)
					flag = true;
				buckets[hashIndex].add(new Integer(data[i]));
			}
			// then copy the values back into vector
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
