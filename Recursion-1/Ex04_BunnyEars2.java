
public class Ex04_BunnyEars2
{
	// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The
	// even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return the
	// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
	public int bunnyEars2(int bunnies)
	{
		return bunnies == 0 ? 0 : bunnyEars2(bunnies - 1) + 3 - (bunnies % 2);
	}
}
