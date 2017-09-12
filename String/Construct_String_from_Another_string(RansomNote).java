/* Given a ransom note string and another string containing letters from all the magazines, 
   return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true

Logic is keep freq count of all letters in magazine string.
Decrement count of characters from ransomnote string. If any character becomes <0, return false.
At the end, if you come out of the loop, return true.(sufficient characters were there in magazine to construct ransomnote.

 */
public boolean canConstruct(String ransomNote, String magazine) {
	int[] arr = new int[26];
	for (int i = 0; i < magazine.length(); i++) {
		arr[magazine.charAt(i) - 'a']++;
	}
	for (int i = 0; i < ransomNote.length(); i++) {
		if(--arr[ransomNote.charAt(i)-'a'] < 0) {
			return false;
		}
	}
	return true;
}