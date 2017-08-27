public void rotate(int[] nums, int k) {
    k %= nums.length;
    reverse(nums, 0, nums.length - 1);	//First reverse the whole array
    reverse(nums, 0, k - 1);			//Then reverse only first k positions 
    reverse(nums, k, nums.length - 1);	//Then reverse the remaining elements
}

public void reverse(int[] nums, int start, int end) {
    while (start < end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
}