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
			map.put(arr[i], map.getOrDefault(arr[i],0)^arr[i]);
			if(set.contains(arr[i]))
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
