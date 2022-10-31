package zero.sandbox;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int key = 21; // key = target, what am I looking for
		int[] a = { 2, 3, 5, 9, 12, 15 };
		//          0  1  2  3   4   5
		
		BinarySearch obj = new BinarySearch();
		int ind = obj.search(a,key); // log(n)		
		System.out.println("Index: " + ind);

		key = 11;
		int[] b = { 2, 4, 5, 19, 12, 150 };
		//          0  1  2  3   4   5
		
		ind = obj.search(b,key); // log(n)		
		System.out.println("Index: " + ind);
		
	}
	
	public int search(int a[], int key) {
		
		
		int left = 0;   // left index
		int right = a.length - 1; // right index
		
		int middle = 0;
		
		while (left <= right) { // perfom the loop while left <= right
			
			middle = (left + right) / 2; // Find the index of the element in the middle
			
			if ( key < a[middle] ){ // if the key is small the value in the middle
				right = middle -1 ;  // the new right is (middle -1)
			} else if ( key > a[middle] ) { // if the key is bigger than the value in the middle
				left = middle + 1;  // the new left is (middle +1)
			} else if ( key == a[middle] ){
				return middle; // if the value is equal return the index of the middle
			}
		}
		
		return -1;
	}


}
