
public class Ex18_Has12
{
	// Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
	public boolean has12(int[] nums)
	{
		int i = 0;
		while (i < nums.length && nums[i++] != 1)
			;
		while (i < nums.length && nums[i] != 2)
			i++;
		return i != nums.length;
	}
}
