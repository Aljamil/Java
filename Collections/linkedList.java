import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class linkedList
{
	public static void main(String[] args)
	{
	   String[] colors1 = {"black", "yellow", "blue", "violet", "silver"};
       List<String> list1 = new LinkedList<>();

       for(String color: colors1)
       {
       	  list1.add(color);
       }

       String[] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};
       List<String> list2 = new LinkedList<>();

       for(String color: colors2)
       {
       	  list2.add(color);
       }

       list1.addAll(list2);
       list2 = null;
       printList(list1);

       convertToUpperStr(list1);
       printList(list1);

       System.out.printf("%nDeleting elements 4 to 6...");
       removeItems(list1, 4, 7);
       printList(list1);
       printReversedList(list1);
	}

	private static void printList(List<String> list)
	{
		System.out.println("\nList:\n");

		for(int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i) + " ");
		}

		System.out.println();
	}

	private static void convertToUpperStr(List <String> list)
	{
		ListIterator<String> iterator = list.listIterator();

		while(iterator.hasNext())
		{
			String color = iterator.next();
			iterator.set(color.toUpperCase());
		} 
	}

	private static void removeItems(List<String> list, int start, int end)
	{
		list.subList(start, end).clear();
	}

	private static void printReversedList(List<String> list)
	{
		ListIterator<String> iter1 = list.listIterator(list.size());

		System.out.printf("%nReversed List%n");

		while(iter1.hasPrevious())
		{
			System.out.printf("%s ", iter1.previous());
		}

		System.out.println();
	}

}