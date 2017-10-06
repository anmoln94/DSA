public class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        char[] map = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.insert(0, map[num & 0b1111]); //gives 4 bits everything as you are 'anding' with 1111.
            num = num >>> 4; //right shift by 4 bits and do the same
            
        }
        return sb.toString();
    }
}