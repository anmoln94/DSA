/* Keep two pointers to know the start(j) and end index(j) of substring.
 * Keep j fixed untill u encounter a repeating character in current substring.
 * Then move j to one index in front of the first occurence of the repeating character (retrieve this from Hashmap)
 * This is done so that the repeating occurence gets treated as a unique character in the future substrings.
 * Hahsmap is used to store key with index where it occurs first in array.
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
}