//Count characters frequency in string 1 and put it in array. Then for every character decrement the count. if it less than 0 at any point , return false.
public class Solution {
    public boolean isAnagram(String s, String t) {
        int [] alpha = new int [256];
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++)
        {
            alpha[s.charAt(i)-'a']++;
            
        }
        for(int j=0;j<t.length();j++)
        {
            if(--alpha[t.charAt(j)-'a']<0)		//we pre decrement so that we can instantly check instead of writing another for loop to see all the count
                return false;
        }
        
        return true;
    }
}