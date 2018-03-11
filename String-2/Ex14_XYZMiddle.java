
public class Ex14_XYZMiddle
{
	public boolean xyzMiddle(String str)
	{
		// numLeft = ind;
		// numRight = str.length() - ind - 3;
		// Math.abs(ind - (str.length() - ind - 3)) <= 1
		// Math.abs(2*ind + 3 - str.length()) <= 1
		// -1 <= 2*ind + 3 - str.length() <= 1
		// -4 <= 2*ind - str.length() <= -2
		// str.length() - 4 <= 2*ind <= str.length() - 2
		// If str.length() = 2a + 1 (odd)
		// 2a - 3 <= 2*ind <= 2a - 1
		// ind = a - 1 = str.length()/2 - 1
		// If str.length() = 2a (even)
		// 2a - 4 <= 2*ind <= 2a - 2
		// ind = a - 2 or a - 1
		// ind = str.length()/2 - 2 or str.length()/2 - 1
		if(str.length() < 3)
		    return false;
		int ind = str.length() / 2 - 1;
		return str.substring(ind, ind+3).equals("xyz") || (str.length() % 2 == 0 && str.substring(ind-1,ind+2).equals("xyz"));
	}
}
