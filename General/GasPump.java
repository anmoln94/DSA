/* Return index of the start of the circular journey.
 * Iterate through the array and if at any point remaining fuel+fuel at current pump < fuel needed, 
 * current start of journey is incorrect. Make start as i+1 and try.
 * The variable total keeps track of the deficit of fuel. By the end of the array, if sum(Surplus fuel) is less than deficit
 * then no start is available where you could successfully complete a circular journey.
 */
class Solution {
	public int canCompleteCircuit(int[] gas, int[] cost) 
	{
		int tank = 0;
		int size = gas.length;
		int sum = 0;
		int res = 0;
		int total = 0;
		for (int i = 0; i < size; ++i) 
		{
			sum += gas[i] - cost[i];
			if (sum < 0) {
				total += sum;
				sum = 0;
				res = i + 1;
			}
		}
		total += sum;
		return total < 0 ? -1 : res;
	}
}