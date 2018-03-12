
public class Ex07_BlackJack
{
	// Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they
	// both go over.
	public int blackjack(int a, int b)
	{
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		if (max > 21)
			return min > 21 ? 0 : min;
		return max;
	}
}
