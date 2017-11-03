import java.util.Scanner;

public class locChar
{
	public static void main(String[] args)
	{
	   Scanner input = new Scanner(System.in);

	   String str = input.nextLine();	

	   System.out.println("a is located at index " + str.indexOf('a'));
	   System.out.println("a is located at index " + str.indexOf('a', 1));
	   System.out.println("$ is located at index " + str.indexOf('$'));
	   System.out.println("al is located at index " + str.indexOf("al"));
	   System.out.println("al is located at index " + str.indexOf("al", 1));

	   System.out.println("a is located at index " + str.lastIndexOf('a'));
	   System.out.println("a is located at index " + str.lastIndexOf('a', 7));
	   System.out.println("al is located at index " + str.lastIndexOf("al"));

	  


	}
}