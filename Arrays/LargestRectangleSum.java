public class Solution {
    public int largestRectangleArea(int[] height) {
        int len = height.length;
        Stack<Integer> s = new Stack<Integer>();
        int maxArea = 0;
        for(int i = 0; i <= len; i++){  // Run through all bars of given histogram
            int h = (i == len ? 0 : height[i]);
            if(s.isEmpty() || h >= height[s.peek()]){   // If this bar is higher than the bar on top stack, push it to stack
                s.push(i);
            }else{		//Find area from right to left till the height of top of stack element becomes less than this bar height
                int tp = s.pop();
                maxArea = Math.max(maxArea, height[tp] * (s.isEmpty() ? i : i - 1 - s.peek()));
                i--;  //this is done so that i-- and i++(from loop increment) leaves i as unchanged
            }
        }
        return maxArea;
    }
}