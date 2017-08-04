package Arrays;

import java.util.Stack;

public class First_greater_element_on_the_right {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr  = new int[]{6,5,4,5};
		
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(arr[0]);
		int next;
		int element;
		for(int i=1;i<arr.length;i++)
		{
			next=arr[i];
			element=stk.pop();
			
	
			while(element<next)
			{
				System.out.println(element+"->"+next);
				if(!stk.isEmpty())
					element = stk.pop();
				else
					break;
			}
					
			if(element>next)
				stk.push(element);
			stk.push(next);
			
		}
		while(!stk.isEmpty())
		{
			System.out.println(stk.pop()+" has no next greater element to the right");
		}

	}

}
