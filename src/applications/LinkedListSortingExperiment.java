package applications;

/**
 * Experiment
 * 
 * The sorting in LinkedList is slower than 
 * copying all the elements into an array, and then use quicksort
 * and then copy them back to the LinkedList
 * 
 * Why?
 * This is because an array has much better cache performance than a linked list. 
 * If the nodes in the list are dispersed in memory, 
 * you may be generating cache misses all over the place. 
 * Then again, if the array is large you will get cache misses anyway.
 * 
 * PS: when n is small, you won't find this out, they have similar performance
 * Only when n is larger can we see the difference
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class LinkedListSortingExperiment {

	protected LinkedList<Integer> ll;
	protected Random ran;

	public LinkedListSortingExperiment(int randomNum) {
		ll = new LinkedList<>();
		ran = new Random();

		initRandomLL(randomNum);
	}

	private void initRandomLL(int randomNum) {
		for (int i = 0; i < randomNum; i++) {
			ll.add(ran.nextInt(20));
		}
	}

	public void sortLinkedList() {
		long start = System.currentTimeMillis();
		Collections.sort(ll);
		long end = System.currentTimeMillis();
		System.out.println("using time: " + (end - start));
	}
	
	public void sortLinkedList2() {
		long start = System.currentTimeMillis();
		Object[] arr= ll.toArray();
		Arrays.sort(arr);
		ll.clear();
		LinkedList<Object> newLL = new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			newLL.add(arr[i]);
		}
		
		long end = System.currentTimeMillis();
		System.out.println("using time: " + (end - start));
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Linkedlist: ");
		for (Object obj : ll) {
			sb.append(obj).append(" ");
		}
		return sb.toString();
	}
}
