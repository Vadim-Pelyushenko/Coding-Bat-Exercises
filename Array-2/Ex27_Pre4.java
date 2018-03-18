
public class Ex27_Pre4
{
	// Given a non-empty array of ints, return a new array containing the elements from the original array that come
	// before the first 4 in the original array. The original array will contain at least one 4. Note that it is valid
	// in java to create an array of length 0.
	public int[] pre4(int[] nums)
	{
		int i;
		for (i = 0; nums[i] != 4; i++);
		int[] list = new int[i--];
		while (i >= 0)
			list[i] = nums[i--];
		return list;
	}
}
