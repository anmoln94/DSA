/* Given n ( the number of opening braces), generate all valid paranthesis ( basically valid paranthesis length  = 2*n).
 * Use Recursion, to generate all possibilities. Similar to Depth first search.
 */

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        
        DFS(list,"",0,0,n);
        
        return list;
        
    }
    
    void DFS(List<String> list,String str,int open,int close,int max)
    {
        if(str.length()==max*2)
        {
            list.add(str);
            return ;
        }
        
        if(open<max)
            DFS(list,str+"(",open+1,close,max);
        if(close<open)
            DFS(list,str+")",open,close+1,max);
    }
}