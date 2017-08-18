/*
Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

*/

public int lengthOfLongestSubstring(String s) {
        int[] charMap = new int[256];
        
        for (int k = 0; k < charMap.length; k++) {
            charMap[k] = -1;
        }
        int i = 0, maxLen = 0;
        for (int j = 0; j < s.length(); j++) {
            if (charMap[s.charAt(j)] >=i) {
                i = charMap[s.charAt(j)] + 1;
            }
            charMap[s.charAt(j)] = j;
            maxLen = Math.max(j - i + 1, maxLen);
        }
    
    return maxLen;
}