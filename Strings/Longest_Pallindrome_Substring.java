/* At every index go left and right as far as possible without crossing boundary of array
 * If a pallindrome is formed, compare its length with max length palindrome until that point.
 */
public class Solution {
	private int lo, maxLen;

	public String longestPalindrome(String s) {
		int len = s.length();
		if (len < 2)
			return s;

		for (int i = 0; i < len - 1; i++) 
		{
			extendPalindrome(s, i, i); 			// To handle odd length palindromes
			
			extendPalindrome(s, i, i + 1); 		// To handle even length palindromes because in even length strings theres no mid
												// so in case when the whole string is palindrome, it will never catch it since
												// either j or k will get over first.
		}
		return s.substring(lo, lo + maxLen);
	}

	private void extendPalindrome(String s, int j, int k) 
	{
		while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) { //compare end index and start index continuously to find palindrome
			j--;
			k++;
		}
		if (maxLen < k - j - 1) 	//compare with maxlength uptill now
		{
			lo = j + 1;
			maxLen = k - j - 1;
		}
	}
}