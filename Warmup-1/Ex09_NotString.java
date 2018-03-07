
public class Ex09_NotString
{
	// Given a string, return a new string where "not " has been added to the front. However, if the string already
	// begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
	public String notString(String str)
	{
		// If its not even long enough to have "not", just add "not"
		// This part is necessary so as not to have IndexOutOfBounds
		if (str.length() < 3)
			return "not " + str;

		String front = str.substring(0, 3);
		return front.equals("not") ? str : "not " + str;
	}
}
