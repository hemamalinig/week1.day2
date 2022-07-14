package week1.day2.assignments.mandatory;

public class Palindrome {

	public static void main(String[] args) {
		//Build a logic to find the given string is Palindrome or not	     
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		
		String isPali = "MAdam";
		String rev = "";
		char[] charArray = isPali.toCharArray();
		for(int i = charArray.length-1; i >=0; i--)
		{
			rev = rev + charArray[i] ;
			System.out.println(rev);
		}
		if(rev.equalsIgnoreCase(isPali))
			System.out.println("palinDrome");
		else System.out.println("not a palinDrome");
	}

}
