
public class Ex30_ZeroFront
{
	// Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are
	// grouped at the start of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0
	// ,0, 1, 1}. You may modify and return the given array or make a new array.
	public int[] zeroFront(int[] nums)
	{
		int o = 0;
		int z = -1;
		while (o < nums.length && z < nums.length)
		{
			while (o < nums.length && nums[o] == 0)
				o++;
			if (o == nums.length)
				break;
			z = Math.max(o + 1, z);
			while (z < nums.length && nums[z] != 0)
				z++;
			if (z == nums.length)
				break;

			int t = nums[o];
			nums[o] = nums[z];
			nums[z] = t;
			o++;
			z++;
		}
		return nums;
	}
}
