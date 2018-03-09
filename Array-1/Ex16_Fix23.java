
public class Ex16_Fix23
{
	// Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0.
	// Return the changed array.
	public int[] fix23(int[] nums)
	{
		if (nums[1] == 2)
			nums[2] = nums[2] == 3 ? 0 : nums[2];
		else
			nums[1] = nums[1] == 3 && nums[0] == 2 ? 0 : nums[1];
		return nums;
	}
}
