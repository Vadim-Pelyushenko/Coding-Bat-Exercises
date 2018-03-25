
public class Ex05_LinearIn
{
	// Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner
	// appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact
	// that both arrays are already in sorted order.
	public boolean linearIn(int[] outer, int[] inner)
	{
		int o = 0;
		for (int i = 0; i < inner.length; i++, o++)
		{
			while (o < outer.length && outer[o] != inner[i])
				o++;

			if (o == outer.length)
				return false;
		}
		return true;
	}
}
