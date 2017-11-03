import java.util.Scanner;

public class stringConcat
{
	public static void main(String[] args)
	{
	   Scanner input = new Scanner(System.in);
	   System.out.print("Enter String #1: ");
	   String str1 = input.nextLine();	
	   System.out.print("Enter String #2: ");
	   String str2 = input.nextLine();	

	   System.out.printf("Result of str1.concat(str2) is %s%n", str1.concat(str2));
	   System.out.printf("Result of str2.concat(str1) is %s%n", str2.concat(str1));
	   System.out.printf("Result of str1 after concatination is %s%n", str1);

	   
	}
}