package thursday;

public class SearchInsert {

	public static void main(String[] args) {
		
        int nums[] = {1,3,5,7,9} , target = 8;
        int nums1[] = {1,3,5,6} , target1 = 2;
        int nums2[] = {1,3,5,6} , target2 = 7;

        System.out.println(searchInsert(nums,target));
        System.out.println(searchInsert(nums1,target1));
        System.out.println(searchInsert(nums2,target2));
	}
	
    public static int searchInsert(int[] nums, int target) {

    int position = nums.length;
        for (int i = 0 ; i < position; i++) {
            if ( nums[i] >= target )
                return i;
        }
        return position;
    }

}


