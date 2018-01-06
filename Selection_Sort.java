import java.util.Arrays;

public class Selection_Sort {

	public static void selectionSort( int[] intArray) {
		
		// Outer loop differentiates the partition of sorted and unsorted
		for ( int i = intArray.length-1; i > 0 ; i-- ) {
		// to start assume the index 0 stores the maximum value
			int maxIndex = 0 ;
//			System.out.println("i="+ i);			
			for( int j = 1 ; j <= i ; j++ ) {
//				System.out.println(j);
//				System.out.println(intArray[j]);				
				if ( intArray[j] > intArray[maxIndex]) {
					// if the value at j index is larger then set the new max value
					maxIndex = j;
				}
			}
			// swap the maximum values and last index of unsorted partition
			swapValues(intArray,i,maxIndex);
			
			System.out.println(Arrays.toString(intArray));
		}
//		System.out.println(Arrays.toString(intArray)); 
	}
	
	public static void swapValues( int[] intArray, int i, int j) {
		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;
	}
	
	public static void main(String[] args) {
		// Create a int Array
		int[] intArray = new int[12];
		intArray[0] = 6700;
		intArray[1] = 67;
		intArray[2] = 45;
		intArray[3] = 4;
		intArray[4] = 32;
		intArray[5] = 21;
		intArray[6] = 6;
		intArray[7] = 1;
		intArray[8] = 456;
		intArray[9] = 362;
		intArray[10] = 3;
		intArray[11] = 6;		
		
		System.out.println(Arrays.toString(intArray));
		selectionSort(intArray);
		System.out.println(Arrays.toString(intArray)); 
	}
	
}
