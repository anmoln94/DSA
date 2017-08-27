/* Given an array: ["eat", "tea", "tan", "ate", "nat", "bat"], 
Return:
[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]

Make a hashmap with key as the each unqiue sorted anagram. Value will be a list of strings which have the same string value as the key.

 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);	//sort the string so that all corresponding anagrams will have the same key
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<String>());
            map.get(keyStr).add(s);		//adding the string in the list corresponding to its anagram
        }
        return new ArrayList<List<String>>(map.values());
    }
}