/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<String> binaryTreePaths(TreeNode root) 
    {
       List<String> list = new ArrayList<String>();
       rec(root,list,"",true);        
       return list;
    }
    
    void rec(TreeNode root,List<String> ls,String s,boolean f)
    {
        if(root!=null)
        {
            if(f==true)
                s+=root.val;
            else
                s+="->"+root.val;
            if(root.left!=null)
                rec(root.left,ls,s,false);
            if(root.right!=null)
                rec(root.right,ls,s,false);
            if(root.left==null && root.right==null)
                ls.add(s);
        }
    }
    
}