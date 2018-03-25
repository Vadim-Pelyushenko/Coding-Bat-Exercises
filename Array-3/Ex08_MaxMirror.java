
public class Ex08_MaxMirror
{
	// We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array,
	// the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is
	// length 3 (the {1, 2, 3} part). Return the size of the largest mirror section found in the given array.
	public int maxMirror(int[] nums)
	{
		int max = 0;
		for (int i = 0; i < nums.length; i++)
		{
			int eval = longestMatch(nums, i);
			if (eval > max)
				max = eval;
		}
		return max;
	}

	public int longestMatch(int[] nums, int ind)
	{
		int max = 0;
		for (int i = ind; i < nums.length; i++)
		{
			int eval = evaluateLength(nums, ind, i);
			if (eval > max)
				max = eval;
		}
		return max;
	}

	public int evaluateLength(int[] nums, int ind, int ind2)
	{
		int length = 0;
		while (ind < nums.length && ind2 >= 0 && nums[ind] == nums[ind2])
		{
			ind++;
			ind2--;
			length++;
		}
		return length;
	}
}
