public class part2_2
{
	public static void main(String[] args)
	{
		int num = 0;
		int even = 0;
		int flag = 0;
		int howmany=0;
		
		howmany= IBIO.inputInt("Enter howmany number you want to enter: ");
		
		for (int i=1; i<=howmany; i++)
		{
		 flag = 0;
		 num=IBIO.inputInt("Enter number" +i+":");
		
			even=num%2;
		
		if(even==0)
		{
			IBIO.output(num + " It is an even number");
			flag = 1;

		}
		if(flag==0)
		{
			IBIO.output(num + " It is an odd number");
			flag = 0;
		}
		
		}
	}
}	
