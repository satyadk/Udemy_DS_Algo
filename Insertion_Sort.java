import java.util.Arrays;

public class Insertion_Sort {

	public static void insertionSort( int[] intArray) {
		
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length;
                firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }
	}
	
	public static void swapValues( int[] intArray, int i, int j) {
		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;
	}
	
	public static void main(String[] args) {
		// Create a int Array
		int[] intArray = new int[6];
		intArray[0] = 6700;
		intArray[1] = 67;
		intArray[2] = 45;
		intArray[3] = 4;
		intArray[4] = 32;
		intArray[5] = 21;
//		intArray[6] = 6;
//		intArray[7] = 1;
//		intArray[8] = 456;
//		intArray[9] = 362;
//		intArray[10] = 3;
//		intArray[11] = 6;		
		
		System.out.println(Arrays.toString(intArray));
		insertionSort(intArray);
		System.out.println(Arrays.toString(intArray)); 
	}
	
}
