package monday;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

    public void Start(){
        int foundkey;
        int sizeOfArray = 10;
        int[] Array = {3, 6, 1, 4, 2, 9, 7, 8, 5, 0};
        int key = 9;
        // --- 
        Arrays.sort(Array);
        //sort array
        foundkey = binarySearchAlgo(Array,sizeOfArray,key);
        //Print values in array after sort
        System.out.println(foundkey);

    }

    int binarySearchAlgo(int[] array, int size, int key){
       
       int start = 0; // start of array index
       int end = array.length - 1; // end of array index
       int middle = 0; // declare and initialize variable

       while (start <= end) {
            //  reassign middle
           middle = (start + end) / 2;

           if (key < array[middle]) {
            // shift end index position
               end = middle - 1;
           } else if (key > array[middle]) {
            // shift start index position
               start = middle + 1;
           } else if (key == array[middle]) {
            // return answer  
               return middle;
           }
       }
       // Index / Value not found   
       return -1;
    }
    
       public static void main(String[] args) {
    	BinarySearch main = new BinarySearch();
        main.Start();
    }
}




