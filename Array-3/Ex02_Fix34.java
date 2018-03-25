
public class Ex02_Fix34
{
	// Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is
	// immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains the same
	// number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.
	public int[] fix34(int[] nums)
	{
		int lastFour = -1;
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] == 3)
			{
				int four = find4(nums, lastFour + 1);
				swap(nums, four, i + 1);
				lastFour = four;
			}
		}
		return nums;
	}

	public int find4(int[] nums, int ind)
	{
		while (ind < nums.length && nums[ind] != 4)
			ind++;
		return ind;
	}

	// Convenience, and makes more readable code
	public void swap(int[] nums, int a, int b)
	{
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
}
