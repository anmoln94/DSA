/*A number is happy if the square of digits becomes 1 at some point as long as the number is >0.

19 is a happy number

12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1

Create a hashset and keep adding the the sum of square of digits at every step.
If at any point you get a sum that was already previously calculated, means you will end up in infinite loop so return false.

*/

public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        
        int squaresum=0;
        int rem=0;
        while(set.add(n))
        {
            squaresum=0;
            while(n>0)
            {
                rem=n%10;
                squaresum+=rem*rem;
                n/=10;
            }
            
           
            if(squaresum==1)
                return true;
            else
                 n=squaresum;
            
        }
        return false;
    }
}