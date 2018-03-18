import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class collections1
{
	public static enum Face {Ace, Deuce, Three;};

    static Face face;
	public static void main(String[] args)
	{

		Face face = Face.Three;
		
		Integer arr[] = {76, 45, 32, 12};
		//String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

		List<Integer> list = Arrays.asList(arr);
		//List<Integer> list = new ArrayList<>();

       /*
        for(int i = 0; i < arr.length; i++)
        {
        	list.add(arr[i]);
        } */


        System.out.print("Unsorted array elements: ");
        for(int i : list)
        {
		  System.out.printf("%d ", i);
        }

        System.out.println();

		Collections.sort(list); 

        System.out.print("Sorted array elements: ");
		for(int i = 0; i < list.size(); i++)
		{
		  System.out.printf("%d ", list.get(i));
		}
		System.out.println();

		Collections.sort(list, Collections.reverseOrder()); 
		System.out.printf("Sorted list(DESC): %s%n", list);

		System.out.println(face.ordinal());


/*
		System.out.printf("Unsorted list: %s%n", list);
        Collections.sort(list);
        System.out.printf("Sorted list: %s%n", list);
*/
	}  
}