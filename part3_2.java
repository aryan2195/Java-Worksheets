public class part3_2
{
public static void main(String[] args)
	
	{ 
	int i = 1;
	int x = IBIO.inputInt("Enter a number: ");

	do
	
	{ 
	i++;
	
	} 
	while ( x<=1 && x % i != 0 );
	
	
	
	
	
	
	IBIO.output(x + " is divisible by " + i);
	}
}









//Change the last program so that it only accepts numbers that are greater than 1 and outputs the
//word prime if indeed the number is prime and otherwise outputs the smallest prime that goes into
//the number.
