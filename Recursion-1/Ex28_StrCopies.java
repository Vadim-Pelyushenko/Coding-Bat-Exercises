
public class Ex28_StrCopies
{
	// Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the
	// string somewhere, possibly with overlapping. N will be non-negative.
	public boolean strCopies(String str, String sub, int n)
	{
		if (n == 0)
			return true;
		int ind = str.indexOf(sub);
		return ind == -1 ? false : strCopies(str.substring(ind + 1), sub, n - 1);
	}
}
