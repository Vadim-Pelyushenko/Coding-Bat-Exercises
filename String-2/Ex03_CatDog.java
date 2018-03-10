
public class Ex03_CatDog
{
	// Return true if the string "cat" and "dog" appear the same number of times in the given string.
	public boolean catDog(String str)
	{
		int c = 0;
		int d = 0;
		for (int i = 0; i < str.length() - 2; i++)
		{
			String trip = str.substring(i, i + 3);
			if (trip.equals("cat"))
				c++;
			else if (trip.equals("dog"))
				d++;
		}
		return c == d;
	}
}
