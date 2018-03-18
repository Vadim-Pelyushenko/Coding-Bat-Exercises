
public class Ex22_CountAbc
{
	// Count recursively the total number of "abc" and "aba" substrings that appear in the given string
	public int countAbc(String str)
	{
		if (str.length() < 3)
			return 0;
		int next = countAbc(str.substring(1));
		String cmp = str.substring(0, 3);
		return next + (cmp.equals("abc") || cmp.equals("aba") ? 1 : 0);
	}
}
