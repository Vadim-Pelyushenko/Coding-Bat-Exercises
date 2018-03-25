
public class Ex09_CountClumps
{
	public int countClumps(int[] nums)
	{
		int total = 0;
		for (int i = 0; i < nums.length;)
		{
			int start = i++;
			while (i < nums.length && nums[i] == nums[start])
				i++;
			if (i - start >= 2)
				total++;
		}
		return total;
	}
}
