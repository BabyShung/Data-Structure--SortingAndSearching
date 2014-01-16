package FundamentalSortings;

public class BubbleSort {

	public void bubbleSort(String a) {
		char[] arr = a.toCharArray();
		char tmp;
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				if (arr[j - 1] > arr[j]) {
					tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				}
			}
		}
		print(arr);
	}

	private void print(char[] arr) {
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]+" ");
		}
		
	}
}
