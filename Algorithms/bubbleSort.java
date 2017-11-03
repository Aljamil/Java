import java.util.Arrays;
import java.security.SecureRandom;

public class bubbleSort
{

	public static void main(String[] args)
	{
	  SecureRandom gen = new SecureRandom();

	  int[] nums = new int[10];

	  for(int i = 0; i < nums.length; i++)
	  {
	  	nums[i] = 10 + gen.nextInt(90);
	  }

	  System.out.printf("Unsorted Numbers: %s.%n", Arrays.toString(nums));
	  bubbleS(nums);
	  System.out.printf("Sorted Numbers: %s.%n", Arrays.toString(nums));


	}

	public static void bubbleS(int[] data)
	{
		

	  for(int i = 0; i < data.length; i++){
		for(int j = 0; j < data.length - 1; j++)
		
			if(data[j] > data[j + 1]){
				int temp = data[j];
				data[j] = data[j + 1];
				data[j + 1] = temp;
			}

		}
		
	}
}