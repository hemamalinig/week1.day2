package week1.day2.assignments.mandatory;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		/*
		 Pseudo Code
		 
		 * Declare String Input as Follow
		  
		 * String test = "changeme";
		 
		 * a) Convert the String to character array
		 
		 * b) Traverse through each character (using loop)
		 
		 * c)find the odd index within the loop (use mod operator)
		 
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		  
		 */		
		String test = "changeme";
		int i;
		char[] charArray = test.toCharArray();
//		System.out.println(charArray.length);
		for(i=0; i < charArray.length; i++)
		{
			if(i % 2 != 0)
			{
				charArray[i] = Character.toUpperCase(charArray[i]);
				System.out.println(charArray[i]);
			}
				
				else 
					System.out.println(charArray[i]);	
			}
	}

}
