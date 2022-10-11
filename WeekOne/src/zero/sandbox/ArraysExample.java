package zero.sandbox;
import java.util.Arrays;

public class ArraysExample {
	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3, 4, 5};  // Array declared with items
		
		int[] nums2 = new int[3]; // Array declared and set length, each index value = 0
		
		nums[0] = 10;
			
		System.out.println("nums Array " +Arrays.toString(nums));
		System.out.println("nums Array Final Index " + nums[nums.length-1]);
		
		System.out.println(nums[0]);
		
	}
}
