/* a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the array and their absolute difference is k.

Input: [3, 1, 4, 1, 5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
 */
public int findPairs(int[] nums, int k) {
	if (nums == null || nums.length == 0 || k < 0)   return 0;

	Map<Integer, Integer> map = new HashMap<>();
	int count = 0;
	for (int i : nums) {
		map.put(i, map.getOrDefault(i, 0) + 1);
	}

	for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		if (k == 0) {
			//count how many elements in the array that appear more than twice.
			if (entry.getValue() >= 2) {
				count++;
			} 
		} else {
			if (map.containsKey(entry.getKey() + k)) { //check if thers another element of k-key in the map
				count++;
			}
		}
	}

	return count;
}