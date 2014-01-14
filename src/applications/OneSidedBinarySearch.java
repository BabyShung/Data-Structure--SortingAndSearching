package applications;

/**
 * One Sided Binary Search algorithm
 * 
 * Different from the traditional binary search algo,
 * it starts from one side, not the middle
 * 
 * Sorted array:
 * 1 2 3 4 5 6 7 8 9 10 11 12
 * 
 * EG1:
 * search 10
 * -since ceiling of log12 is 4
 * -jump from 1 to 9 (1 + 8, PS: 8 is 2 to the power of 3)
 * -jump from 9 to 9 since it can't jump further
 * -jump from 9 to 11 (9 + 2, PS: 2 is 2 to the power of 1)
 * -jump from 11 to 10 (11 -1, PS: 1 is 2 to the power of 0)
 * -search done
 * 
 * EG2:
 * search 8
 * -jump from 1 to 9
 * -jump from 9 to 5 (9 - 4 = 5)
 * -jump from 5 to 7 (5 + 2 = 7)
 * -jump from 7 to 8 (7 + 1 = 8)
 * -search done
 * 
 * @author haozheng
 *
 */


public class OneSidedBinarySearch {

	public int oneSidedBinarySearch(int[] arr, int K) {

		int log2 = getLog(arr.length);
		int currentI = 0;

		while (log2 >= -1) {

			System.out.println("currentI: " + currentI);
			System.out.println("arr[currentI]: " + arr[currentI]);

			if (arr[currentI] == K) {
				return arr[currentI];

			} else if (arr[currentI] < K) { // jump right

				int newIndex = currentI + (1 << log2);

				if (newIndex < arr.length) {
					currentI = newIndex;
				}
			} else { // jump left

				currentI = currentI - (1 << log2);
			}

			log2--;

		}
		return -1;
	}

	private int getLog(int N) {
		// actually this value is 1 less than the original for array index
		int tmp = (int) (Math.log(N) / Math.log(2));
		return tmp;
	}
}
