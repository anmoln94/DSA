/* Elements occuring odd number of times: Create Hashset. Remove the element if it already exists in set. 
At the end, all remaining elements occur odd times.

Elements occuring even number of times: Create Hashmap. If element does not exist, add it to the hashmap with value 0^arr[i].
If it already exists change its value to arr[i]^arr[i].
(Since exor of even number of times occuring elements is 0).
At the end, all the keys which have value 0, occur even number of times.
*
*/

package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ElementsoccuringOddtimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[]{1,4,1,2,3};
		
		Set<Integer> set=new HashSet<Integer>();
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>(); //for elements occuring even times
		
		
		for(int i=0;i<arr.length;i++)
		{
			map.put(arr[i], map.getOrDefault(arr[i],0)^arr[i]);	//For detecting even number of times
			if(set.contains(arr[i]))				//For detecting odd number of times
				set.remove(arr[i]);
			else
				set.add(arr[i]);
		}
		
		System.out.print("Elements that occured even number of times: ");
		for(int i:map.keySet())
		{
			if(map.get(i)==0)
				System.out.println(i+" ");
		}
		System.out.print("Elements that occured odd number of times: ");
		for(int i:set)
		{
			System.out.print(i+" ");
		}

	}

}
