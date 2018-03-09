
public class Ex24_FrontPiece
{
	// Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length
	// 2, use whatever elements are present.
	public int[] frontPiece(int[] nums)
	{
		return nums.length < 2 ? nums : new int[] { nums[0], nums[1] };
	}
}
