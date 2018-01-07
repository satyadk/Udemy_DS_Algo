import java.util.Arrays;

public class QuickSort {
	
	public static void quicksort ( int[]  array, int start, int end) {
		// if the index is 1 return
		if ( end-start < 2) return ;
		
		//get the pivot index 
		int pivotIndex = partition(array, start, end);
		quicksort(array,start,pivotIndex);
		quicksort(array,pivotIndex+1,pivotIndex);
	}
	
	// [ 20, 25,15,55,7,1 ]
	// [ 55, 25,15,15,7,1 ] j= 4 i=3
	public static int partition(int[] array, int start, int end) {
		
		int pivot = array[0] ;
		int i = start;
		int j = end;
		while ( i < j ) {
			
			//empty loop still we find a value that is lower than pivot 
            while (i < j && array[--j] >= pivot);
            if ( i < j ) {
            	array[i] = array[j];
            }
			while ( i < j && array[++i] <= pivot );
			if ( i < j) {
				array[j] =  array[i];
			}
		}
		array[j] = pivot;
		return j;
	}

	
	public static void main(String[] args) {
		// Create a int Array
		int[] intArray = {99,56,78,89,2222,4,5,56,23,45,56,77,2,-3,0,4,9,22,2345,66,1,4,7,8,34,56,78};
		System.out.println(Arrays.toString(intArray));
		quicksort(intArray,0, intArray.length);
		System.out.println(Arrays.toString(intArray)); 
	}
	
}
