
public class Ex31_WithoutTen
{
	// Return a version of the given array where all the 10's have been removed. The remaining elements should shift
	// left towards the start of the array as needed, and the empty spaces a the end of the array should be 0. So {1,
	// 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given array or make a new array.
	public int[] withoutTen(int[] nums)
	{
		int i = 0;
		while (i < nums.length && nums[i] % 10 != 0)
			i++;
		int s = i;
		while (i < nums.length)
		{
			while (i < nums.length && nums[i] % 10 == 0)
				nums[i++] = 0;
			while (i < nums.length && nums[i] % 10 != 0) 
				swap(nums,s++,i++);
		}
		return nums;
	}
	
	public void swap(int[] list, int a, int b) 
	{
		int temp = list[a];
		list[a] = list[b];
		list[b] = temp;
	}
}
