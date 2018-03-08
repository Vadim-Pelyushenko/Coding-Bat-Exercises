
public class Ex29_ShareDigit
{
	// Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as
	// the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right
	// digit.)
	public boolean shareDigit(int a, int b)
	{
		int qa = a / 10;
		int ra = a % 10;

		int qb = b / 10;
		int rb = b % 10;
		return qa == qb || qa == rb || ra == qb || ra == rb;
	}
}
