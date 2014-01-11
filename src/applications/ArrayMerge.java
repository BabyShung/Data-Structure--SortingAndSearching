package applications;

/**
 * Question:
 * array a and b are sorted
 * array a has n elements, but it still has other space to store all elements of array b
 * merger b to a and make it sorted
 * @author haozheng
 *
 */

public class ArrayMerge {

	public ArrayMerge(){
		
	}
	
	public ArrayMerge(int capacityA,int capacityB){
		
	}
	
	public void merge(int[] a, int[] b, int lastA, int lastB) {

		int iA = lastA - 1;
		int iB = lastB - 1;
		int iM = lastA + lastB - 1;

		while (iA >= 0 && iB >= 0) {
			if (a[iA] > b[iB]) {
				a[iM] = a[iA];
				iA--;
			} else {
				a[iM] = b[iB];
				iB--;
			}

			iM--;
		}

		while (iB >= 0) {
			a[iM] = b[iB];
			iB--;
			iM--;
		}

	}

}
