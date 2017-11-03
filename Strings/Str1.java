
import java.util.Scanner;

public class Str1
{
	public static void main(String[] args)
	{
		System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
		String str1 = input.nextLine();

		char[] charArray = new char[str1.length()];

		System.out.printf("The length of string is: %d \n", str1.length());

		System.out.print("The reverse string is ");

		for(int i = str1.length() - 1; i >= 0; i--)
		{
			System.out.printf("%c", str1.charAt(i));
		}

		System.out.println();

		int n = str1.length();
		str1.getChars(3, 5 ,charArray, 0);

		System.out.print("The charArray is ");

		for(char char1: charArray)
		{
			System.out.printf("%c", char1);
		}

		System.out.println();

	}

}