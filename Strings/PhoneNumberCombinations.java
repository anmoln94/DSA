//Take the number string, choose one digit it and form combinations with all the previously existing combinations


public class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> list = new LinkedList<String>();
        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        if(digits.length()==0)
            return list;
        list.add("");
        
        for(int i=0;i<digits.length();i++)
        {
            int x = Character.getNumericValue(digits.charAt(i));
            while(list.peek().length()==i)
            {
                String t= list.remove();
                for( char c: mapping[x].toCharArray())
                {
                    list.add(t+c);
                }
            }
        }
        
        return list;
        
    }
}