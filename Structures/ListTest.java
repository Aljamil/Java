import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest
{
	public static void main(String[] args)
	{
	   String str1[] = {"Yellow", "Red", "Blue"};

	   List <String> list1 = new LinkedList<>();

	   for(String cnt : str1)
	   {
	   	list1.add(cnt);
	   }

	   String str2[] = {"Green", "Violet", "Orange"};

	   List <String> list2 = new LinkedList<>();

	   for(String cnt : str2)
	   {
	   	 list2.add(cnt);
	   }

	   list1.addAll(list2);
	   list2 = null;

	   printList(list1);

	   printUpperCase(list1);
	   printList(list1);

	   System.out.printf("%nDeleting 4 to 6: ");
	   removeItems(list1, 4, 6);
	   printList(list1);

	   printReverse(list1);


	}

	public static void printList(List <String> lst)
	{
		System.out.print("The list of Jericho: ");

		for(String color : lst)
		{
			System.out.printf(" %s, ", color);
		}

		System.out.println();
	}


	public static void printUpperCase(List <String> lst)
	{
		ListIterator <String> iterator = lst.listIterator();

		while(iterator.hasNext())
		{
			String color = iterator.next();
			iterator.set(color.toUpperCase());
		}
	}

	public static void removeItems(List <String> lst, int start, int end)
	{
		lst.subList(start, end).clear();
	}

	private static void printReverse(List <String> lst)
	{
		ListIterator <String> iterator = lst.listIterator(lst.size());

		System.out.print("Reversed List: ");

		while(iterator.hasPrevious())
		{
			System.out.printf(" %s, ", iterator.previous());
		}

		System.out.println();
	}


}