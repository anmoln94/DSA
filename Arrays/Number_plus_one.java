// Given a number represented as an array of digits, add one to the number and return the resulting number as an array.
public int[] plusOne(int[] digits) {
        
    int n = digits.length;
    for(int i=n-1; i>=0; i--) {
        if(digits[i] < 9) {
            digits[i]++;		//either adding carry still makes the digit less than 9 or it was the LSB
            return digits;
        }
        
        digits[i] = 0;		//if the digit was a 9
    }
    
    int[] newNumber = new int [n+1];	//it will reach here only if there was a carry after MSB also
    newNumber[0] = 1;
    
    return newNumber;
}