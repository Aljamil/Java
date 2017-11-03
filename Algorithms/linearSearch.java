
import java.util.Scanner;

public class linearSearch
{
	public static void main(String[] args)
	{
		int nums[] = {9, 10, 6, 3, 2, 1, 1};

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number: ");
		int key = input.nextInt();

		System.out.printf("The number is located in %d.%n", linearS(nums, key));
	}

	private static int linearS(int[] arr, int key)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if (arr[i] == key)
				return i;
		}
		return -1;
	}
}