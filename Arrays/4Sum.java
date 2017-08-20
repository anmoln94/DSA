/*Given 4 arrays, find how many tuples(1 element from each) sum upto 0.
 * Create a hashmap with all possible sum combinations of elements of arrays A & B.
 * Then calculate all possible sums with arrays C&D, and check each time if an opposite value sum is already there in the hashmap.
 * If yes, then this is one possible tuple. 
 */
public class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int sum=0;
        Map<Integer,Integer> map= new HashMap<Integer,Integer>();
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<B.length;j++)
            {
                sum=A[i]+B[j];
                if(map.containsKey(sum))
                {
                    map.put(sum,map.get(sum)+1);
                }
                else
                    map.put(sum,1);
            }
        }
        
        int res=0;
        
        for(int i=0;i<C.length;i++)
        {
            for(int j=0;j<D.length;j++)
            {
                sum=C[i]+D[j];
                if(map.containsKey(sum*-1))
                {
                    res+=map.get(sum*-1);
                }
            }
        }
        return res;
    }
}