import java.util.Arrays;

public class Bubble_Sort {

	public static void bubbleSort( int[] intArray) {
		
		for ( int i = intArray.length-1; i > 0 ; i-- ) {
			System.out.println("i="+ i);			
			for( int j = 0 ; j < i ; j++ ) {
//				System.out.println(j);
//				System.out.println(intArray[j]);				
				if ( intArray[j] < intArray[j+1]) {
					swapValues(intArray, j, j+1);
				}
			}
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
		intArray[0] = 67;
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
		bubbleSort(intArray);
		System.out.println(Arrays.toString(intArray)); 
	}
	
}
