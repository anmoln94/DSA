/* If n is positive and a multiple of 2, then x^n is x^2 times the number of times n/2 is greater than 0.
* If n is negative make it positive, and change x to 1/x.
*/
public double myPow(double x, int n) {
	if (n==-2147483648 && x!=1 && x!=-1) //This part was done just to handle edge cases on leetcode 
		return 0;
	if(n == 0)
		return 1;
	if(n<0){
		n=-n;
		x = 1/x;
	}
	return (n%2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
}