import java.util.Scanner;

public class stringBuilder1
{
	public static void main(String[] args)
	{
	   Scanner input = new Scanner(System.in);

	   System.out.print("Enter the string: ");
	   String str = input.nextLine();

	   StringBuilder buffer = new StringBuilder(str);

	   System.out.printf("The string is %s.%n", buffer.toString());

	   System.out.printf("The char at index 0 is %c and at index 5 is %c.%n", buffer.charAt(0), buffer.charAt(5));

	   System.out.printf("The string is %s.%n", buffer.toString());

	   char[] charArray = new char[buffer.length()];

	   buffer.getChars(0, buffer.length(), charArray, 0);

	   System.out.printf("The characters of charArray are :");

	   for(char charac : charArray)
	   {
	   		System.out.print(charac);
	   }

	   System.out.println();

	   buffer.setCharAt(0, 'A');
	   buffer.setCharAt(5, 'L');
	   System.out.printf("The new string is %s.%n", buffer.toString());

	   buffer.reverse();

	   System.out.printf("The reverse of string is %s.%n", buffer.toString());


	   buffer.append(charArray);

	   System.out.printf("After appended the buffer and charArray %s.%n", buffer.toString());

	   buffer.insert(0, "Hoy! ");

	   System.out.printf("After to insert \" Hoy! \" %s.%n", buffer.toString());

       buffer.delete(5, 19);
       buffer.deleteCharAt(5);

       System.out.printf("After deleting: %s.%n", buffer.toString());
	   
	}
}