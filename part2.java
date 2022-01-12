public class part2
{
	
	public static void main (String[] args)
	{	
		int steps  = IBIO.inputInt("Steps: ");
		int start  = IBIO.inputInt("Start: ");
		int inc    = IBIO.inputInt("Increment: ");
		int number = start;
		for(int i  = steps; i > 0; i--) 
		{
			IBIO.out(number + " ");
			number = number + inc;
		}
		
		
	}
}
