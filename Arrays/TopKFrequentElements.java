 /*
- Create frequency map of each digit
- Get frequency of key, increment by 1 and add to map
- Use an array to save numbers into different bucket whose index is the frequency
- Starting with largest index(max frequency) add first k elements to result
 */
 
 public List<Integer> topKFrequent(int[] nums, int k) {
    
    //create frequency map of each digit
	List<Integer>[] bucket = new List[nums.length + 1];
	Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
    
    // get frequency of key, increment by 1 and add to map
	for (int n = 0; n < nums.length; n++) {
		frequencyMap.put(nums[n], frequencyMap.getOrDefault(nums[n], 0) + 1);
	}

    // use an array to save numbers into different bucket whose index is the frequency

	for (int key : frequencyMap.keySet()) {
		int frequency = frequencyMap.get(key);
		if (bucket[frequency] == null) {
			bucket[frequency] = new ArrayList<>();
		}
		bucket[frequency].add(key);
	}

	List<Integer> res = new ArrayList<>();
    //Starting with largest index(max frequency) add first k elements to result
	for (int pos = bucket.length - 1; pos >= 0 && res.size() < k; pos--) {
		if (bucket[pos] != null) {
			res.addAll(bucket[pos]);
		}
	}
	return res;

    }