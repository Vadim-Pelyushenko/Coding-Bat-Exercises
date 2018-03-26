
public class Ex15_ScoresSpecial
{
	// Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a multiple of 10, such
	// as 40 or 90. Return the sum of largest special score in A and the largest special score in B. To practice
	// decomposition, write a separate helper method which finds the largest special score in an array. Write your
	// helper method after your scoresSpecial() method in the JavaBat text area
	public int scoresSpecial(int[] a, int[] b)
	{
		return scoresSpecial(a) + scoresSpecial(b);
	}

	public int scoresSpecial(int[] arr)
	{
		int max = 0;
		for (int val : arr)
			if (val % 10 == 0 && val > max)
				max = val;
		return max;
	}
}
