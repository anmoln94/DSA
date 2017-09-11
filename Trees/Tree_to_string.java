/* You need to construct a string consists of parenthesis and integers from a binary tree with the preorder traversing way.
 * If node has only right child, the left null node needs to be represented by empty parenthesis pair "()".
 * If node has only left child, the right node is represented by ")".

Binary tree: [1,2,3,4]
       1
     /   \
    2     3
   /    
  4     

Output: "1(2(4))(3)"


Binary tree: [1,2,3,null,4]
       1
     /   \
    2     3
     \  
      4 

Output: "1(2()(4))(3)"


 */
public String tree2str(TreeNode t) {
        if (t == null) return "";
        
        String result = t.val + "";
        
        String left = tree2str(t.left);
        String right = tree2str(t.right);
        
        if (left == "" && right == "") 
        	return result;
        if (left == "") 
        	return result + "()" + "(" + right + ")";
        if (right == "") 
        	return result + "(" + left + ")";	//If right  child is null, no need to put empty braces
        return result + "(" + left + ")" + "(" + right + ")";
    }