
public class Ex33_EvenOdd
{
	// Return an array that contains the exact same numbers as the given array, but rearranged so that all the even
	// numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and
	// return the given array, or make a new array.
	public int[] evenOdd(int[] nums)
	{
		int o = 0;
		int z = -1;
		while (o < nums.length && z < nums.length)
		{
			while (o < nums.length && nums[o] % 2 == 0)
				o++;
			if (o == nums.length)
				break;
			z = Math.max(o + 1, z);
			while (z < nums.length && nums[z] % 2 == 1)
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
