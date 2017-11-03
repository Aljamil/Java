import java.util.Scanner;

public class compareStr2
{
	public static void main(String[] args)
	{
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);

		int n;
		System.out.print("Enter the number of String you input: ");
		n = input1.nextInt();
		String[] str = new String[n];

		System.out.print("Enter the Strings: ");

		for(int i = 0; i < n; i++)
		{
			str[i] = input2.nextLine();
		}

		for(int i = 0; i < n; i++)
		{
			System.out.println(str[i]);
		}


		for(String string : str)
		{
			if(string.startsWith("a"))
			{
				System.out.printf("The %s is starts with \" a \". %n", string);
			}

		}

		for(String string : str)
		{
			if(string.startsWith("ja", 3))
			{
				System.out.printf("The %s is starts with \" ja \" at position 3. %n", string);
			}
		}


		for(String string : str)
		{

			if(string.endsWith("mil"))
			{
				System.out.printf("The %s is ends with \" mil \". %n", string);
			}
		}
	}
}