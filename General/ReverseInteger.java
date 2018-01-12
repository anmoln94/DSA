//Handle overflows by keeping reverse as 'long' since reverse of an integer might become larger than the largest value int can hold

public int reverse(int x) {
	long rev= 0;
	while( x != 0){
		rev= rev*10 + x % 10;
		x= x/10;
		if( rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
			return 0;
	}
	return (int) rev;
}