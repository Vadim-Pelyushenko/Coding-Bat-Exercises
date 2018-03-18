
public class Ex01_Factorial
{
	// Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively
	// (without loops).
	public int factorial(int n)
	{
		return n < 2 ? 1 : n * factorial(n - 1);
	}
}
