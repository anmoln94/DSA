/* Return the element which occurs more than n/2 times in an array.
  Start with 0th index number as the major number.
  Each time you get a repetition of it increase count. Else decrease count.
  If you basically had equal number of "major" element and non major element until this point of array, count would be 0.
  But since a major number does exist, the point at which count becomes 0, reassign major number to that new number.
  Ultimately, since major number will occur atleast n/2 +1 times, you will return the major number.
 */
public class Solution {
    public int majorityElement(int[] num) {

        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;
            
        }
        return major;
    }
}