package applications;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Question: Given a string array, sort them so that the anagrams lie next to
 * each other
 * 
 * sol1: Think about for two strings, if they are anagrams, then the sum of all
 * ASCII value should be the same. Then sort by this int value using comparator
 * 
 * ---O(nlogn) time and O(n) space since used quicksort O(n) space
 * 
 * 
 * sol2: sort every two strings, if they are anagrams, then after the sort they
 * should be the same still O(nlogn) but slower than sol1;
 * 
 * sol3: use hashmap (linkedlist style) to store, and finally read all of them
 * from the hashmap
 * 
 * 
 * @author haozheng
 * 
 */

public class sortAnagramsOfStringArray {

	// sol1
	public void sortAnagrams(String[] arr) {
		Arrays.sort(arr, new AnagramComparator());
	}

	private class AnagramComparator implements Comparator<String> {

		@Override
		public int compare(String a, String b) {

			int vA = 0, vB = 0;

			for (int i = 0; i < a.length(); i++)
				vA += a.charAt(i);
			for (int i = 0; i < b.length(); i++)
				vB += b.charAt(i);

			if (vA > vB)
				return 1;
			else if (vA < vB)
				return -1;
			else
				return 0;
		}

	}

	// sol2

	public void sortAnagrams2(String[] arr) {
		Arrays.sort(arr, new AnagramComparator2());
	}

	private class AnagramComparator2 implements Comparator<String> {

		@Override
		public int compare(String a, String b) {
			return sortString(a).compareTo(sortString(b));
		}

	}

	// shared method
	private String sortString(String str) {
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}

	// sol3
	public void sortAnagrams3(String[] arr) {
		HashMap<String, LinkedList<String>> hm = new HashMap<>();
		for (String s : arr) {
			String key = sortString(s);
			if (!hm.containsKey(key)) {
				hm.put(key, new LinkedList<String>());
			}
			LinkedList<String> anagrams = hm.get(key);
			anagrams.push(s);
		}

		//O(n^2)
		int index = 0;
		for (String key : hm.keySet()) {
			LinkedList<String> list = hm.get(key);
			for (String str : list) {
				arr[index] = str;
				index++;
			}
		}
	}

}
