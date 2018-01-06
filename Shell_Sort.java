import java.util.Arrays;

public class Shell_Sort {
	
	public static void shellSort ( int[]  array) {
		
		// first loop for different intervals
		// intervals go on reducing 
		for ( int iInterval = array.length/2 ; iInterval > 0 ; iInterval = iInterval /2 )
		{
			for ( int i = iInterval ; i < array.length ; i++) {
		
				int iNewElement = array[i];

				int j ;
				for ( j = i ; j-iInterval >= 0 && array[j - iInterval ] > iNewElement ; j -= iInterval  ) {
					array[j] = 	array[j - iInterval ]	;			
				}
				array[j] = iNewElement;
				System.out.println(Arrays.toString(array)); 

			}
		}
	}

	
	public static void main(String[] args) {
		// Create a int Array
		int[] intArray = {99,56,78,89,2222,4,5,56,23,45,56,77,2,-3,0,4,9,22,2345,66,1,4,7,8,34,56,78};
		System.out.println(Arrays.toString(intArray));
		shellSort(intArray);
		System.out.println(Arrays.toString(intArray)); 
	}
	
}
