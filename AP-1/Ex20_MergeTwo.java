
public class Ex20_MergeTwo
{
	// Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates.
	// Return a new array containing the first N elements from the two arrays. The result array should be in
	// alphabetical order and without duplicates. A and B will both have a length which is N or more. The best "linear"
	// solution makes a single pass over A and B, taking advantage of the fact that they are in alphabetical order,
	// copying elements directly to the new array.
	public String[] mergeTwo(String[] a, String[] b, int n)
	{
		String[] result = new String[n];
		int i = 0;
		int j = 0;
		for (int k = 0; k < n; k++)
		{
			if (a[i].compareTo(b[j]) < 0)
				result[k] = a[i++];
			else
				result[k] = b[j++];

			while (i < a.length && a[i].equals(result[k]))
				i++;
			while (j < b.length && b[j].equals(result[k]))
				j++;
		}
		return result;
	}
}
