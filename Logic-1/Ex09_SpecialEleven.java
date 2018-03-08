
public class Ex09_SpecialEleven
{
	// We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. Return true
	// if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod
	public boolean specialEleven(int n)
	{
		int r = n % 11;
		return r == 0 || r == 1;
	}
}
