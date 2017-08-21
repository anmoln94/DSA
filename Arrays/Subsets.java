/*Similar to generating permutations except that at every level we push the current list
 * at whatever length it maybe , whereas in permutation we would wait for length to become
 * equal to length of array.
 * Recursively start forming combinations and backtrack at each level to change the combination
 * by removing the last element added to the list at that level.
 */
public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums); 	//all subsets are sorted order
    backtrack(list, new ArrayList<>(), nums, 0);
    return list;
}

private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
    list.add(new ArrayList<>(tempList));
    for(int i = start; i < nums.length; i++)
    {
        tempList.add(nums[i]);
        backtrack(list, tempList, nums, i + 1);
        tempList.remove(tempList.size() - 1);
    }
}