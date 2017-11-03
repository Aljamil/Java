import java.util.Scanner;
import java.util.Arrays;

public class ArrayTest
{
	public static void main(String[] args)
	{

		int[] array;

		int n, m;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number you want to input: ");
        n = input.nextInt();
        array = new int[n];

        System.out.print("Enter the number: ");

        for(int i = 0; i < n; i++)
        {
             m = input.nextInt();

             array[i] = m;
        }

        System.out.print("The numbers you inputted are: ");

        Arrays.sort(array);

        for(int i = 0; i < array.length; i++)
        {
        	System.out.print((array[i]) + " ");
        }

        System.out.println();
	}

/*
	public static int selectionSort(int[] a)
	{

	}
	*/
}