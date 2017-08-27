/* Given an array of numbers, form the largest number possible.
 * Convert each number to a string and store it in a string array.
 * It is known if we have two string numbers, there are two possibilities:
 * s1+s2 gives one number and s2+s1 gives one number (here + signifies concatenation)
 * Using this we make a comparator which will generate all possible combinations, and then we use this comparator
 * to sort the string array in descending order to get the max possible number.
 */
public class Solution 
{
	public String largestNumber(int[] num) 
	{
		if (num == null || num.length == 0)
			return "";

		// Convert int array to String array, so we can sort later on
		String[] s_num = new String[num.length];
		for (int i = 0; i < num.length; i++)
			s_num[i] = String.valueOf(num[i]);

		// Comparator to decide which string should come first in concatenation
		Comparator<String> comp = new Comparator<String>() 
		{
			@Override
			public int compare(String str1, String str2) 
			{
				String s1 = str1 + str2;
				String s2 = str2 + str1;
				return s2.compareTo(s1); // reverse order here, so we can do
											// append() later
			}
		};

		Arrays.sort(s_num, comp);

		// An extreme edge case by lc, say you have only a bunch of 0 in your
		// int array
		if (s_num[0].charAt(0) == '0')
			return "0";

		StringBuilder sb = new StringBuilder();
		for (String s : s_num)
			sb.append(s);

		return sb.toString();

	}
}