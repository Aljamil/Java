import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class List1
{
	public static void main(String[] args)
	{
	    String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List <String> list = new ArrayList<String>();

        for(String color: colors)
        	list.add(color);

        String[] removeColors = {"RED", "WHITE", "BLUE"};
        List <String> removeList = new ArrayList<String>();

        for(String color: removeColors)
        	removeList.add(color);

        System.out.println("LIST: ");

        for(int i = 0; i < list.size(); i++)
        	System.out.printf("%s ", list.get(i));

        System.out.println("\nREMOVELIST: ");

        for(int i = 0; i < removeList.size(); i++)
        	System.out.printf("%s ", removeList.get(i));

        removeColor(list, removeList);

        System.out.println("\nThe list after removeColor.");

        for(String i : list)
        	System.out.printf("%s ", i);

        System.out.println();



	}

	public static void removeColor(Collection<String> collect1, Collection<String> collect2)
	{
		Iterator<String> iter1 = collect1.iterator();

		while(iter1.hasNext())
		{
			if(collect2.contains(iter1.next()))
				iter1.remove();
		}
	}
}