//Create a hashmap with frequency of characters. Iterate through it and return the first letter whose frequency is 1.
 
public class Solution 
{
    public int firstUniqChar(String s) 
    {
    	if (s.length() == 1) 
        {
            return 0;
        }
    	Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
        for(int i = 0;i < s.length(); i++ ) 
        {

            if(map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            else
                map.put(s.charAt(i),1);
        }
        
        System.out.println(map);
        
        for (Character key : map.keySet()) 
        {
            if(map.get(key)==1)
                return s.indexOf(key);
        }
        return -1;
    }
}