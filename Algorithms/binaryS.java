import java.util.Scanner;
import java.util.Arrays;

public class binaryS
{


	public static void main(String[] args)
	{
		int nums[] = {10, 6, 3, 2, 1};

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number: ");
		int key = input.nextInt();
		Arrays.sort(nums);

		System.out.printf("%nArrays after sort %s.%n", Arrays.toString(nums));
		
		System.out.printf("The number is located in %d.%n", binaryS(nums, key));
	}


	public static int binaryS(int arr[], int key)
	{
	   int low = 0;
	   int high = arr.length - 1;
	   int middle = (low + high + 1) / 2;
	   int location = -1;

	   while((low <= high) && (location == -1)){

	   for(int i = 0; i < middle; i++)
	   	  if(key == arr[middle])
	   	  	location = middle;
	   	  else if(key < arr[middle])
	   	  	high = middle - 1;
	   	  else
	   	  	low = middle + 1;

	   	  middle = (low + high + 1)/2;
		}

	return location;
	}

	
}