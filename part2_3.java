public class part2_3
{
	public static void main (String[] args)
	{
		int num = 0;
		
		num= IBIO.inputInt("Enter the number you want to enter: ");
		
		if (num%2 ==0)
		{
			IBIO.output("Number is even");
		}
		else
		{
			IBIO.output("Number is odd");
		}
		
	}
}
