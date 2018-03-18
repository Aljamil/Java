
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1
{
	public static void main(String[] args)
    {
    	ArrayList<String> items = new ArrayList<>();
        ArrayList<String> item1 = new ArrayList<String>();

    	items.add("red");
    	items.add("yellowGreen");

    	System.out.println("Display list contents with counter-controlles loop: ");

    	for(int i = 0; i < items.size(); i++)
        {
    		System.out.printf("%s ", items.get(i));
        }

        newLine();

        System.out.println("Display elements with enhance statement");

        items.add("yellow");
        items.add("green");

        Collections.sort(items);
        display(items, "New list of items: ");

        items.remove("yellowGreen");
        display(items, "Remove the instance of yellowGreen: \n");

        items.remove(1);
        display(items, "Remove the instance of index 1: \n");

        System.out.printf("\"yellow\" is %s in the list%n", items.contains("yellow") ? ""
            : "not");

        item1.trimToSize();

        System.out.printf("SIZE: %s%n", item1.size());

        System.out.println("The instance of green is in the index of " + items.indexOf("green"));

        items.clear();
        display(items, "New list of items");

    }   

    public static void display(ArrayList<String> item, String header)
    {
        System.out.printf(header);

        for(String i: item)
            System.out.printf(" %s", i);

        newLine();
    }

    public static void newLine()
    {
        System.out.println();
    }
}