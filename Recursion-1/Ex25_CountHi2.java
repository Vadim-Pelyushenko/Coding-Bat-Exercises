
public class Ex25_CountHi2
{
	// Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not
	// count "hi" that have an 'x' immedately before them.
	public int countHi2(String str)
	{
		if (str.length() < 2)
			return 0;
		if (str.charAt(0) == 'x')
		{
			if (str.charAt(1) == 'x')
				return countHi2(str.substring(1));
			else
				return countHi2(str.substring(2));
		}
		if (str.substring(0, 2).equals("hi"))
			return 1 + countHi2(str.substring(2));
		return countHi2(str.substring(1));
	}
}
