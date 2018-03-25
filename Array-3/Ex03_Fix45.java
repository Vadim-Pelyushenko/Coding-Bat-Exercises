
public class Ex03_Fix45
{
	// (This is a slightly harder version of the fix34 problem.) Return an array that contains exactly the same numbers
	// as the given array, but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's, but every
	// other number may move. The array contains the same number of 4's and 5's, and every 4 has a number after it that
	// is not a 4. In this version, 5's may appear anywhere in the original array.
	public int[] fix45(int[] nums)
	{
		int[] fives = get5Indices(nums);
		int next = fives.length - 1;

		for (int i = nums.length - 2; i >= 0; i--)
		{
			if (nums[i] == 4 && nums[i + 1] != 5)
			{
				swap(nums, i + 1, fives[next--]);
			}
		}
		return nums;
	}

	public int[] get5Indices(int[] nums)
	{
		int count = 0;
		for (int i = 0; i < nums.length; i++)
			if (nums[i] == 5)
				count++;
		int[] fives = new int[count];

		int next = 0;
		for (int i = 0; i < nums.length; i++)
			if (nums[i] == 5)
				fives[next++] = i;
		return fives;
	}

	public void swap(int[] nums, int a, int b)
	{
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}
}
