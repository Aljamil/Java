import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Sort1
{
	public static void main(String[] args)
	{
	   String[] aws = {"Diamonds", "Ace", "Heart", "Spade"};
	   int[] ako = {6,3,5,7,4};

	   List<String> list1 = Arrays.asList(aws);
	   List<Integer> list2 = new ArrayList<Integer>();
	   

	   for(int j = 0; j < ako.length; j++)
	   {
	   	  list2.add(ako[j]);
	   }

	   System.out.printf("The Unsorted elements for integers: ");
	   
	    for(int i : list2)
	    {
	    	System.out.printf("%d, ", i);
	    }
		

		System.out.println();

	   System.out.printf("The Unsorted elements for Strings %s. %n", list1);

	   Collections.sort(list1);
	   Collections.sort(list2);

	   System.out.printf("%nThe sorted element for Strings: %s. %n", list1);
	   System.out.printf("%nThe sorted element for Integer: ");
	    for(int i : list2)
	    {
	    	System.out.printf("%d ", i);
	    }

	    System.out.println();

	}
}