import java.util.Scanner;

public class stringBuilder
{
	public static void main(String[] args)
	{
	   Scanner input = new Scanner(System.in);

	   System.out.print("Enter the string: ");
	   String str = input.nextLine();

	   StringBuilder buffer = new StringBuilder(str);

	   System.out.printf("The capacity is %d and the length is %d.%n", buffer.length(), buffer.capacity());

	   buffer.ensureCapacity(75);
	   buffer.setLength(20);

	   System.out.printf("The new capacity is %d and the new length is %d while the new string is %s.%n", 
	   						buffer.capacity(), buffer.length(), buffer.toString()); 
	}
}