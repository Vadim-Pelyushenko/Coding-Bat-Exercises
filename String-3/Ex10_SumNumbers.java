
public class Ex10_SumNumbers
{
	// Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is
	// a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars
	// '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
	public int sumNumbers(String str)
	{
		int sum = 0;
		for (int i = 0; i < str.length();)
		{
			int val = 0;
			while (i < str.length() && Character.isDigit(str.charAt(i)))
				val = val * 10 + Character.getNumericValue(str.charAt(i++));
			sum += val;
			i++;
		}
		return sum;
	}
}
