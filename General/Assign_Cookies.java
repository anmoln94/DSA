/* Given array g of how many cookies it takes to satisfy each child. Given S array of the size of cookies available.
 if g[i]<s[j], a child will be satisfied.
 A child can get only 1 cookie at max.
 Return the max number of children that can be satisfied.
 
 LOGIC: Use greedy approach. Sort both arrays.
 each time a child is satisfied increment move forward in both arrays else only in 's' array.. 
 at the end 'i', is the number of children that were satisfied.
 
 */
public int findContentChildren(int[] g, int[] s) 
{
	Arrays.sort(g);
	Arrays.sort(s);
	int i = 0;
	for(int j=0;i<g.length && j<s.length;j++) {
		if(g[i]<=s[j]) i++;
	}
	return i;

}