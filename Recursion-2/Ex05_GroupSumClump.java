
public class Ex05_GroupSumClump
{
	public boolean groupSumClump(int start, int[] nums, int target)
	{
		if (target == 0)
			return true;
		if (start >= nums.length)
			return false;

		int i = start;
		while (i < nums.length && nums[i] == nums[start])
			i++;
		return groupSumClump(i, nums, target) || groupSumClump(i, nums, target - nums[start] * (i - start));
	}
}
