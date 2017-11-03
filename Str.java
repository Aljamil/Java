
import java.util.Scanner;

public class Str{
	public static void main(String[] args)
	{
		String str1, str2;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter string 1: ");
		str1 = input.nextLine();

		System.out.print("Enter string 2: ");
		str2 = input.nextLine();


		System.out.println("The combined string is ");
		combinedString(str1, str2);
	}

	private static void combinedString(String s1, String s2)
	{
		for(int i = 0; i < s1.length() && i < s2.length(); i++)
		{
			System.out.print(s1.charAt(i) + "" + s2.charAt(i));
		}
	}
}