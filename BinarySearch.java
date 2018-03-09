public class BinarySearch {

    public static void main(String[] args) {
        int[] intArray = { -22, -15, 1, 7, 20, 35, 55 };

        System.out.println(iterativeBinarySearch(intArray, -15));
        System.out.println(iterativeBinarySearch(intArray, 35));
        System.out.println(iterativeBinarySearch(intArray, 8888));
        System.out.println(iterativeBinarySearch(intArray, 1));

        System.out.println(recursiveBinarySearch(intArray, -15));
        System.out.println(recursiveBinarySearch(intArray, 35));
        System.out.println(recursiveBinarySearch(intArray, 8888));
        System.out.println(recursiveBinarySearch(intArray, 1));
    }

    public static int iterativeBinarySearch(int[] input, int value) {
        int start = 0;
        int end = input.length;

        while (start < end) {
            int midpoint = (start + end) / 2;
            System.out.println("midpoint = " + midpoint);
            if (input[midpoint] == value) {
                return midpoint;
            }
            else if (input[midpoint] < value) {
                start = midpoint + 1;
            }
            else {
                end = midpoint;
            }
        }

        return -1;
    }

    public static int recursiveBinarySearch(int[] input, int value) {
        return recursiveBinarySearch(input, 0, input.length, value);
    }

    public static int recursiveBinarySearch(int[] input, int start, int end, int value) {
        if (start >= end) {
            return -1;
        }

        int midpoint = (start + end) / 2;
        System.out.println("midpoint = " + midpoint);

        if (input[midpoint] == value) {
            return midpoint;
        }
        else if (input[midpoint] < value) {
            return recursiveBinarySearch(input, midpoint + 1, end, value);
        }
        else {
            return recursiveBinarySearch(input, start, midpoint, value);
        }
    }
	
	public static Boolean binarySearch1(int[] arr, int n){
        // Think about maintaining the boundaries of your array with a lo
        // index and a hi index. lo=0; hi=length - 1;
        int lo = 0;
        int hi = arr.length - 1;
        // Use a while loop to iterate until lo <= hi. The moment that lo exceeds
        // hi, we can be sure that the entire array has been searched. 
        while(lo <= hi){
            // Create a mid index. int mid = lo + (hi-lo)/2;
            int mid = lo + (hi-lo)/2;
            // If arr[mid] < n, set lo = mid+1 to divide the array
            if(arr[mid] < n) lo = mid+1;
            // Else If arr[mid] > n, set hi = mid - 1 to divide the array
            else if(arr[mid] > n) hi = mid-1;
            // Otherwise, return true!
            else return true;
        }
        return false;
    }
}
