
public class Ex11_Only14
{
	// Given an array of ints, return true if every element is a 1 or a 4.
	public boolean only14(int[] nums)
	{
		for (int i : nums)
			if (i != 1 && i != 4)
				return false;
		return true;
	}
}
