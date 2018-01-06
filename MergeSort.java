import java.util.Arrays;

public class MergeSort {

	public static void mergeSort ( int[] array , int start, int end ) {
		if ( end - start < 2  ) {
			return ;
		}
		int mid = (end+start) /2 ;
		mergeSort(array,start,mid);
		mergeSort(array,mid,end);
		
		merge( array, start, mid, end);
	}
	
	public static void merge(int[] array, int start, int mid, int end ) {
		
		// left and right arrays are already sorted 
		// below condition optimizes 
		// no need to merge values because right array all values greater then left array 
		if( array[mid-1] <= array[mid]) {
			return ;
		}
		
		// merger left and right arrays 
		int[] temp = new int[end-start];
		int i = start ;
		int j = mid ;
		int tempIndex = 0;
		while ( i < mid && j < end ) {
			temp[tempIndex++] =  array[i] <= array[j] ? array[i++] : array[j++];   
		}
 		
		//Copy the remaining elements from Left Array with index i 
		// Copying the remaining elements from the Right Array is not required because the values are already greater or sorted 
		// arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		// Copies an array from the specified source array, beginning at the specified position, to the specified position of the destination array.
		System.arraycopy(array, i, array, start+tempIndex, mid-i);
		
		// now copy the temp array into original 
		System.arraycopy(temp,0,array,start,tempIndex);
		
				
	}
	
	public static void main ( String[] args) {
		
		int[] intArray = {99,56,78,89,2222,4,5,56,23,45,56,77,2,-3,0,4,9,22,2345,66,1,4,7,8,34,56,78};
//		int[] intArray = {99,56};
		System.out.println(Arrays.toString(intArray));
		mergeSort(intArray, 0, intArray.length);
		System.out.println(Arrays.toString(intArray)); 
		
	}
}
