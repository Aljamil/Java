import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

public class hashSet
{
	public static void main(String[] args)
	{
        String[] colors = {"red", "white", "blue", "green", "gray",
             "orange", "tan", "white", "cyan", "peach", "gray", "orange"};

        List<String> set = Arrays.asList(colors);

        System.out.printf("List: %s%n", set);
        printNonDuplicates(set);
	}

	public static void printNonDuplicates(Collection<String> values)
	{
		Set<String> hash = new HashSet<>(values);

		System.out.print("Non-duplicate elements: ");

		for(String value : values)
		{
			System.out.printf("%s ", value);
		}

		System.out.println();


	}
}
