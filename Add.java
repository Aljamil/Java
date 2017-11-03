import java.util.Scanner;

public class Add
{
  public static void main(String[] args)
  {
    int num1, num2, sum;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter number 1: ");
    num1 = input.nextInt();

    System.out.print("Enter number 2: ");
    num2 = input.nextInt();

    sum = num1 + num2;

    System.out.println("The sum is " + sum + ".");
  } 
}
