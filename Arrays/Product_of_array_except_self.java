/* Given an array, return an array whose ith index element is the product of every other element.
 * Make an array result, whose ith index contains product of all elements to its right.
 * Then modify the same array, by multiplying the ith index element with product 
 * of all all elements to the left.
 * Basically at the end , 
 * every element is equal = Product of all element on left* Product of all element on right side
 */
public int[] productExceptSelf(int[] nums) {
    int[] result = new int[nums.length];
 
    result[nums.length-1]=1;
    for(int i=nums.length-2; i>=0; i--){
        result[i]=result[i+1]*nums[i+1];
    }
 
    int left=1;
    for(int i=0; i<nums.length; i++){
        result[i]=result[i]*left;
        left = left*nums[i];
    }
 
    return result;
}