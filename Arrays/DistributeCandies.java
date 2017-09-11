/* Given an integer array with even length, where different numbers in this array represent different kinds of candies.
 * Distribute the candy equally to bro and sis. Return the max number of kinds of candies the sister could gain.
 * Use Hashset to find the different number of candies in the array.
 * If its greater than half the size of array, max number of unique candies to be given to sis is array length/2.
 * If its less than half the size of array, return that size.
 */
public class Solution {
    public int distributeCandies(int[] candies) {

        Set<Integer> kinds = new HashSet<>();
        for (int candy : candies) kinds.add(candy);
        return kinds.size() >= candies.length / 2 ? candies.length / 2 : kinds.size();
    }
}