import java.util.Scanner;

public class Compare{
	
	public static void main(String[] args)
	{
	   Scanner input = new Scanner(System.in);

	   int num1, num2;

	   System.out.print("Enter number 1: ");
	   num1 = input.nextInt();

	   System.out.print("Enter number 2: ");
       num2 = input.nextInt();


       if(num1 == num2){
       	System.out.println(num1 + " is equal to " + num2);
       }

       else if(num1 > num2){
       	System.out.printf("%d%s%d%n", num1, " is greater than ", num2);
       }

       else{
       	System.out.println(num1 + " is less than to " + num2);
       }
	}
}