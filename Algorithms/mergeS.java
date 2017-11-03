import java.util.Arrays;
import java.security.SecureRandom;

public class mergeS{

	public static void mergeSort(int[] data)
	{
		sortArray(data, 0, data.length - 1);

	}
	// splits array, sorts subArrays and merges subArrays into sorted array 
	public static void sortArray(int[] data, int low, int high)
	{
		// test base case; size of array equals 1
		if((high - low) >= 1)
		{
			int middle1 = (low + high) / 2; //calculate middle array
			int middle2 = middle1 + 1; //calculate next element over


			//output split
			//System.out.printf("%nsplit:   %s%n", subArrayString(data, low, high));
			//System.out.printf("%nsplit:   %s%n", subArrayString(data, low, middle1));
			//System.out.printf("%nsplit:   %s%n", subArrayString(data, middle2, high));

			//split array in half; sort each half

			sortArray(data, low, middle1);
			sortArray(data, middle2, high);

			// merge sort array after split

			merge(data, low, middle1, middle2, high);

		}
	}

	public static void merge(int[] data, int left, int mid1, int mid2, int right)
	{
		int leftIndex = left; // index into left subarray
		int rightIndex = mid2; // index into right array
		int combinedIndex = left; // index into temporary working array
		int[] combined = new int[data.length]; // working array


		//output two substring
		//System.out.printf("Merge:   %s.%n", subArrayString(data, left, mid1));
		//System.out.printf("        %s.%n", subArrayString(data, mid2, right));

        //merge until reaching end of either
		while((leftIndex <= mid1) && (rightIndex <= right))
		{
			if(data[leftIndex] <= data[rightIndex])
			
				combined[combinedIndex++] = data[leftIndex++];
			
			else
				combined[combinedIndex++] = data[rightIndex++];
			

		}

			//if left array is empty

			if(leftIndex == mid2)
				//copy in the rest of right array
				while(rightIndex <= right)
					combined[combinedIndex++] = data[rightIndex++];
			else //right array is empty 
				//copy in the rst of left array
				while(leftIndex <= mid1)
					combined[combinedIndex++] = data[leftIndex++];

			//copy values back into original array

			for(int i = left; i <= right; i++)
				data[i] = combined[i];

			//System.out.printf("          %s.%n%n", subArrayString(data, left, right));	
	}


	private static String subArrayString(int[] data, int low, int high)
	{
		StringBuilder temporary = new StringBuilder();

		// output spaces for aligntment
		for(int i = 0; i < low; i++)
			temporary.append(" ");


		// output elements left in array
		for(int i = low; i <= high; i++)
			temporary.append(" " + data[i]);

		return temporary.toString();
	}





	public static void main(String[] args)
	{
		SecureRandom gen = new SecureRandom();

		int[] nums = new int[10];

		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = 10 + gen.nextInt(99);
		}

		System.out.printf("Unsorted Array: %s.%n", Arrays.toString(nums));
		mergeSort(nums);
		System.out.printf("Sorted Array: %s.%n", Arrays.toString(nums));
	}

}