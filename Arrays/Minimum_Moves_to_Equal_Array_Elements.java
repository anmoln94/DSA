/*Array of size n, find the minimum number of moves required to make all array elements equal, 
 * where a move is incrementing n - 1 elements by 1.
 * 
Input:
[1,2,3]

Output:
3

Explanation:
Only three moves are needed (remember each move increments two elements):

[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 
Logic: 

sum + m * (n - 1) = x * n , where x is the equal element in the final array
Now x = minNum + m (Suppose it takes 'm' moves , its basically incrementing the smallest number in the array 'm' times)

Substituting 'x' in the first equation

sum - minNum * n = m ( we return m)
 
*/

public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int minnum=nums[0];
        int sum=0;
        for(int n :nums)
            sum+=n;
        return sum - minnum *nums.length;
        
    }