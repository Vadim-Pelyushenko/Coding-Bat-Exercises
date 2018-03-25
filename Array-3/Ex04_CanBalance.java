
public class Ex04_CanBalance
{
	// Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one
	// side is equal to the sum of the numbers on the other side.
	public boolean canBalance(int[] nums)
	{
		int sum = 0;
		for (int i = 0; i < nums.length; i++)
			sum += nums[i];

		if (sum % 2 == 1)
			return false;
		sum /= 2;

		int leftSum = 0;
		for (int i = 0; i < nums.length; i++)
		{
			leftSum += nums[i];
			if (leftSum == sum)
				return true;
		}
		return false;
	}
}
