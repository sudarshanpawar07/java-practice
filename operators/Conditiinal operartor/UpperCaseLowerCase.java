import java.util.Scanner;
class UpperCaseLowerCase
{
	public static void main(String [] args)
	{
		System.out.print(" Enter the character : ");
		
		char ch = new Scanner(System.in).next().charAt(0);
		
		String op =  ( ch >= 'A' && ch <= 'Z') ? " Uppercase " : ( ch >= 'a' && ch <= 'z') ? " LowerCase " : (ch >= 48 && ch <= 57 )? "Digit" : " Special Character";
		System.out.println("The character is : " + op);
	}
}