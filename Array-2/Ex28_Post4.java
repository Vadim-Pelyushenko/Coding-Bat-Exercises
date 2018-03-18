
public class Ex28_Post4
{
	// Given a non-empty array of ints, return a new array containing the elements from the original array that come
	// after the last 4 in the original array. The original array will contain at least one 4. Note that it is valid in
	// java to create an array of length 0.
	public int[] post4(int[] nums)
	{
		int i;
		for (i = nums.length - 1; nums[i] != 4; i--)
			;
		int[] list = new int[nums.length - ++i];
		int s = 0;
		while (s < list.length)
			list[s] = nums[i + s++];
		return list;
	}
}
