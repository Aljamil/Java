
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;



public class ArrayStruct1
{
	public static void main(String[] args)
	{
		String[] colors = {"magenta", "red", "white", "blue", "cyan"};
		List <String> list = new ArrayList<String>();

		for(String str : colors)
		{
			list.add(str);
		}

		String[] removeColors = {"magenta", "white"};
		List <String> removeList = new ArrayList<String>();

		for(String rstr : removeColors)
		{
			removeList.add(rstr);
		}

		System.out.print("ArrayList: ");

		for(int i = 0; i < list.size(); i++)
		{
			System.out.printf(" %s ", list.get(i));
		}

		System.out.println();

		removeColors(list, removeList);

		System.out.printf("%n%n ArrayList after removeColors.%n%n");

		for(String str: list)
		{
			System.out.printf(" %s ", str);
		}

		System.out.println();

	   }

		public static void removeColors(Collection <String> iter1, Collection<String> iter2)
		{
			Iterator <String> iter = iter1.iterator();

			while(iter.hasNext())
			{
				if(iter2.contains(iter.next()))
					iter.remove();
			}
		}

	
}