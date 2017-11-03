import java.security.SecureRandom;
import java.util.Arrays;

public class insertSort{
	public static void main(String[] args)
	{
		SecureRandom gen = new SecureRandom();

		int[] nums = new int[10];

		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = 10 + gen.nextInt(90);
		}

		System.out.printf("Unsorted numbers: %s.%n", Arrays.toString(nums));

		insertionSort(nums);

		System.out.printf("Sorted numbers: %s.%n", Arrays.toString(nums));


	  
	}

	public static void insertionSort(int[] data)
	{
		for(int next = 1; next < data.length; next++)
		{
			int insert = data[next];
			int moveItem = next;

			while(moveItem > 0 && data[moveItem - 1] > insert)
			{
				data[moveItem] = data[moveItem - 1];
				moveItem--;
			}

			data[moveItem] = insert;
			printPass(data, next, moveItem);
		}
	}

	public static void printPass(int data[], int pass, int index)
	{
		System.out.printf("After Pass %2d: ", pass);

		for(int i = 0; i < index; i++)
		
			System.out.printf("%d ", data[i]);

			System.out.printf("%d* ", data[index]);
		

		for(int i = index + 1; i < data.length; i++)
			System.out.printf("%d ", data[i]);
	     

	     System.out.printf("%n               ");

		for(int i = 0; i <= pass; i++)
		
			System.out.printf("-- ");
		

		System.out.println();
	}
}