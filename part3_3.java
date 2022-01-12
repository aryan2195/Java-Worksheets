public class part3_3
{
	public static void main(String[] args)
	{
		int input;
	int number = input;
	int sum = 0;
	while (number > 0) {
    int digit = number % 10;
    sum += digit * digit * digit;
    number /= 10;
}

	IBIO.output("the sum of the digits of the number is " + sum);
	
	}
}
