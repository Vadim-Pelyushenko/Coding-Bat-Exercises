
public class Ex09_DividesSelf
{
	// We'll say that a positive int divides itself if every digit in the number divides into the number evenly. So for
	// example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not divide into
	// anything evenly, so no number with a 0 digit divides itself. Note: use % to get the rightmost digit, and / to
	// discard the rightmost digit.
	public boolean dividesSelf(int n)
	{
		int t = n;
		while (t > 0)
		{
			int dig = t % 10;
			if (dig == 0 || n % dig != 0)
				return false;
			t /= 10;
		}
		return true;
	}
}
