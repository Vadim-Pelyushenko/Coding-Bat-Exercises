
public class Ex02_BunnyEars
{
	// We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears
	// across all the bunnies recursively (without loops or multiplication).
	public int bunnyEars(int bunnies)
	{
		return bunnies == 0 ? 0 : 2 + bunnyEars(bunnies - 1);
	}
}
