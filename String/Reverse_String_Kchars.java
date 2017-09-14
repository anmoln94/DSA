/* Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. 
   If there are less than k characters left, reverse all of them. 
   If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.
 
 */
public class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0;
        while(i < n) {
            int j = Math.min(i + k - 1, n - 1); //As long as u have k characters, reverse it, else reverse only the remaining characters.
            swap(arr, i, j);
            i += 2 * k;
        }
        return String.valueOf(arr);
    }
    private void swap(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }
}