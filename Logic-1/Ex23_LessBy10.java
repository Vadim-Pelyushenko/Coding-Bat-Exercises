
public class Ex23_LessBy10
{
	// Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
	public boolean lessBy10(int a, int b, int c)
	{
		return Math.max(a, Math.max(b, c)) - Math.min(a, Math.min(b, c)) >= 10;
	}
}
