/* Given a string, sort it in decreasing order based on the frequency of characters.
 * Logic is to keep an array of all the freq of every character.
 * Group them into buckets based on the freq, and make a string out of each count.
 * Iterate in decending order appending those strings based on the freq.
 */
public String frequencySort(String s) {
	if(s.length() < 3)
		return s;
	int max = 0;
	int[] map = new int[256];
	for(char ch : s.toCharArray()) {
		map[ch]++;
		max = Math.max(max,map[ch]);
	}
	String[] buckets = new String[max + 1]; // create max buckets
	for(int i = 0 ; i < 256; i++) { // join chars in the same bucket
		String str = buckets[map[i]];
		if(map[i] > 0)
			buckets[map[i]] = (str == null) ? "" + (char)i : (str + (char) i);
	}
	StringBuilder strb = new StringBuilder();
	for(int i = max; i >= 0; i--) { // create string for each bucket.
		if(buckets[i] != null)
			for(char ch : buckets[i].toCharArray())
				for(int j = 0; j < i; j++)
					strb.append(ch);
	}
	return strb.toString();
}