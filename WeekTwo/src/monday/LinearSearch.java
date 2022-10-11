package monday;

public class LinearSearch {

	public static void main(String[] args) {
		
	       int[] arr = {3, 4, 1, -2, 4, 8, 10, 100, 11};
	       int n = 8;
	       System.out.println(isExist(arr, n));

		}
	
	public static boolean isExist(int[] arr, int n) {

	       boolean result = false;
	       
	       for ( int i = 0; i < arr.length; i++ ) {
	            if (arr[i] == n) {
	                 result = true;
	            } 
	        }
	        return result;
	    }
	    
}
