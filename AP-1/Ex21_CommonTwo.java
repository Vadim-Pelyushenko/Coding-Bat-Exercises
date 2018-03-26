
public class Ex21_CommonTwo
{
	// Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates. Return the count
	// of the number of strings which appear in both arrays. The best "linear" solution makes a single pass over both
	// arrays, taking advantage of the fact that they are in alphabetical order.
	public int commonTwo(String[] a, String[] b)
	{
		int total = 0;
		int i = 0;
		int j = 0;
		while (i < a.length && j < b.length)
		{
			int diff = a[i].compareTo(b[j]);
			if (diff < 0)
				while (++i < a.length && a[i] == a[i - 1]);
			else if (diff > 0)
				while (++j < b.length && b[j] == b[j - 1]);
			else
			{
				total++;
				while (++i < a.length && a[i] == a[i - 1]);
				while (++j < b.length && b[j] == b[j - 1]);
			}
		}
		return total;
	}
}
