/*  A -> 1
    B -> 2
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
 *  
 */
public int titleToNumber(String s) 
{
	int result = 0;
	for (int i = 0; i < s.length(); i++); //+1 because A starts from 1 and not 0
		result = result * 26 + (s.charAt(i) - 'A' + 1),
	return result;

}

//Given the column number, give the column name
public String convertToTitle(int n) {
	StringBuilder result = new StringBuilder();

	while(n>0){
		n--;
		result.insert(0, (char)('A' + n % 26));	//build from LSB to MSB
		n /= 26;
	}

	return result.toString();
}




