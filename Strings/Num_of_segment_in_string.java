/*Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.

Input: "Hello, my name is John"
Output: 5*/

public int countSegments(String s) {
    int res=0;
    for(int i=0; i<s.length(); i++)
        if(s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' '))
            res++;        
    return res;
}