import java.util.Arrays;

public class CountingSort {
	
	public static void countingSort ( int[]  array, int min, int max) {
		
		//create a array to count the number of occurrences 
		int[] countingArray = new int[(max - min) +1 ];
		
		for ( int i = 0; i < array.length ; i++) {
			countingArray[array[i]-min]++;
		}
		
		int j = 0;
		for ( int i = min ; i <= max ; i++ ) {
			while (countingArray[i-min] > 0) {
				array[j++] = i ;
				countingArray[i-min]--;
			}
		}
	}
	

	
	public static void main(String[] args) {
		// Create a int Array
		int[] intArray = {2,3,4,5,6,1,1,1,3,6,4,9,0,2,4,7,8};
		System.out.println(Arrays.toString(intArray));
		countingSort(intArray,0,10);
		System.out.println(Arrays.toString(intArray)); 
	}
	
}
