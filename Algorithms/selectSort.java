

import java.util.Arrays;
import java.security.SecureRandom;

public class selectSort
{
	public static void main(String[] args)
	{
		SecureRandom gen = new SecureRandom();

		int[] numbers = new int[10];

		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = 10 + gen.nextInt(90);
		}

		System.out.printf("Unsorted Numbers: %s.%n", Arrays.toString(numbers));

		selectionSort(numbers);

		System.out.printf("Sorted Numbers: %s. %n", Arrays.toString(numbers));

	}

	private static void selectionSort(int[] data)
	{
	  for(int i = 0; i < data.length - 1; i++){

	  	int smallest = i;

	  for(int j = i + 1; j < data.length; j++)
	  	 if(data[j] < data[smallest])
	  	 	smallest = j;

	  	 swap(data, i, smallest);

	  	 //printPass(data, i + 1, smallest);
	  	}
	}

	private static void swap(int[] data, int first, int second)
	{
		int temporary = data[first];
		data[first] = data[second];
		data[second] = temporary;
	}

	private static void printPass(int data[], int pass, int index)
	{
		System.out.printf("%nAfter pass %2d", pass);

		for(int i = 0; i < data.length; i++)
			System.out.printf("%d  ", data[i]);

		//System.out.printf("%d  ", data[index]);

		for(int i = index + 1; i < data.length; i++)
			System.out.printf("%d    ", data[i]);

		System.out.printf("%n            ");

		for(int j = 0; j < pass; j++)
			System.out.print("--  ");

		System.out.println();
	}
}