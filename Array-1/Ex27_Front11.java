
public class Ex27_Front11
{
	// Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either
	// array is length 0, ignore that array.
	public int[] front11(int[] a, int[] b)
	{
		if (a.length == 0)
			return b.length == 0 ? new int[] {} : new int[] { b[0] };
		return b.length == 0 ? new int[] { a[0] } : new int[] { a[0], b[0] };
	}
}
