
public class MyFibonacci
 {
  public static void main(String[] args) 
  {
	
    int i = 0, n = 0, firstTerm = 0, secondTerm = 1, nextTerm=0, gt20Term=0, digitCount=0, ctr=0;
   double avg=0.00, addTerm=0.00;
    
    
		
    
    IBIO.output("Aryan Guha");
    
 
	   n=IBIO.inputInt("Calculate up to term (n)?");
	  
	 if (n !=0)
    {
		
	  if(n<0)
	  {
		  do
		  {
			IBIO.output("Error - enter a positive number");
			n=IBIO.inputInt("Calculate up to term (n)?");  // how to print in the same line ask sir?
		
			}while(n<0);
		}
		else
		{
			
	
			while (i <= n) 
			{
    
		
			IBIO.out(firstTerm + "; ");

			gt20Term = firstTerm;
			digitCount= firstTerm;
			addTerm =  addTerm + firstTerm;
			avg= addTerm/n;
	
			// The fibonacci actual code
			nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
	
	
			i++;
		 
			}
	
	
		
		}
		
				if(n > 20)
				{
				IBIO.output("Term " + n + ": " + gt20Term);
			
				}
				IBIO.output("Sum = " +addTerm);
				IBIO.output("Average = " +avg);
				
			
				while (digitCount != 0) 
				{
				digitCount = digitCount/10;
      
				ctr++;
				}

    System.out.println("Number of digits: " + ctr);
    
		}
		
  }
}
