import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class treeSet
{
	public static void main(String[] args)
	{
	      String[] colors = {"red", "white", "blue", "green", "gray",
             "orange", "tan", "white", "cyan", "peach", "gray", "orange"};

             SortedSet<String> tree = new TreeSet<>(Arrays.asList(colors));

             System.out.print("Sorted Set: ");
             printSet(tree);

             System.out.print("headSet (\"orange\"): ");
             printSet(tree.headSet("orange"));

             System.out.print("tailset (\"orange\"): ");
             printSet(tree.tailSet("orange"));

             System.out.printf("first: %s%n", tree.first());
             System.out.printf("last: %s%n", tree.last());
           
	}

	private static void printSet(SortedSet<String> set)
	{
		for(String s: set)
			System.out.printf("%s ", s);

		System.out.println();
	}
}