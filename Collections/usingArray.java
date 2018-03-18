import java.util.LinkedList;
import java.util.Arrays;

public class usingArray
{
	public static void main(String[] args)
	{
       String[] colors = {"black", "blue", "yellow"};
       LinkedList<String> list = new LinkedList<>(Arrays.asList(colors));

       list.addLast("red");
       list.add("pink");
       list.add(3, "green");
       list.addFirst("cyan");

       colors = list.toArray(new String[list.size()]);

       System.out.println("Colors: ");

       for(String color: colors)
       	System.out.println(color);
   }
}