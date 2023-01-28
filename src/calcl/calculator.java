package calcl;

import java.util.Scanner;

public class calculator {

	

	public static void main(String[] args) {
		Scanner valueInput = new Scanner(System.in);
		String val5 = "y";
		String val4;
		do {
			System.out.println("Enter value1, value2, operation to perfom by selecting inputing the adjacent code");
			
			//Scanner valueInput = new Scanner(System.in);

			//Variables to store Values for the calculations.
			Double val1 = valueInput.nextDouble();
			Double val2 = valueInput.nextDouble();
		
			
			//Selecting the Desired Operation
			System.out.println("For addition:: Press 1"); 
			System.out.println("For subtraction:: Press 2");
			System.out.println("For division:: Press 3");
			System.out.println("For multiplication:: Press 4");
			System.out.println("For Remainder:: Press 5");

			// Variable to Store the OPeration
			int val3 = valueInput.nextInt();
			
			//Condition Statements to determine which operation to be executed.	  
		  	if (val3 == 1) {
		  		System.out.println("Sum of value 1 + value2 ::" + (val1 +val2));
		  	
		  	}else if (val3 == 2) {
		  		System.out.println("Subtraction of " + val1 + "-" + val2 + "::" + (val1 - val2));
			
		  
		  	}else if (val3 == 3) {
		  		System.out.println("division of value 1 / value2 ::" + (val1 / val2));
			
		  	}else if (val3 == 4) {
		  		System.out.println("multiplication of value 1 - value2 ::" + (val1 * val2));
			
		  
		    	}else if (val3 == 5) {
		      		System.out.println("modulo of value2 % value2::" + (val1 % val2));

		  	}else {
		    		System.out.println("Do You want to Try again");
		  		}
		  	System.out.println("press y to Perfom a new calculation");
		  	System.out.println("press N to Exit");
		  	
		  	 val4 = valueInput.next();
		}
		while(val4 == val5);
	  	
	  	


	}


}


