/*Given an array of strings, find the common prefix amongst all of them.
 * Sort the strings in lexicographical order. We need to only check first and last string.
 * 
 */
class Solution {
	public String longestCommonPrefix(String[] strs) {
		StringBuilder result = new StringBuilder();

		if (strs != null && strs.length > 0) {

			Arrays.sort(strs);

			char[] a = strs[0].toCharArray();
			char[] b = strs[strs.length - 1].toCharArray();

			for (int i = 0; i < a.length; i++) {
				if (b.length > i && b[i] == a[i]) {
					result.append(b[i]);			//keep adding till the letters match, break as soon as letter dont match
				} else {
					return result.toString();
				}
			}

		}
		return result.toString();
	}
}