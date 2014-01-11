import applications.ArrayMerge;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayMerge am = new ArrayMerge();
		
		
		int[] a = { 1, 2, 9, 10, 13, -1, -1, -1, -1, -1, -1, -1 };
		int[] b = {4,5,7,9,11,12,14};
		
		am.merge(a, b, 5, 7);
		for(int i = 0; i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
		
		
	}

}
