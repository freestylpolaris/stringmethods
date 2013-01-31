/**
 * This program demonstrates a few of the string methods
 *
 * @author Ryan Hickman
 *
 */

public class StringMethods 
{
	public static void main (String [] args)
	{
		String message = "Java is Great Fun!";	//Assigns the message variable message to a String
		String upper = message.toUpperCase();	//Converts the message variable to upper case
		String lower = message.toLowerCase();	//Converts the message variable to lower case
		char letter = message.charAt(2);		//Finds the second letter of the string literal
		int stringSize = message.length();		//Calculates the character length of the string literal
		
		System.out.println(message);			// Displays the variable message's string literal content
		System.out.println(upper);				// Displays the variable message's string literal content in upper case
		System.out.println(lower);				// Displays the variable message's string literal content in lower case
		System.out.println(letter);				// Displays the variable message's string literal's second digit
		System.out.println(stringSize);			// Displays the character size of the variable message's string literal content
		
	
	}

}
