import java.util.Scanner;

public class EvenOdd
{
	public static void main(String[] args)
	{
		int a, b;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		a = input.nextInt();

		System.out.print("Enter the second number: ");
		b = input.nextInt();

		System.out.println(oddEven(a, b));
	}

	private static int oddEven(int a, int b)
	{
		int ans = 0;

		if(a == b)
		{
			return a;
		}

		else if (a > b)
		{
			return a;
		}

		else
		{
			for(int i = a; i <= b; i++)
			{
				if(i % 2 == 0)
				{
					ans *= i;
				}

				else
				{
					ans += i;
				}
			}

			return ans;
		}

		
	}
}