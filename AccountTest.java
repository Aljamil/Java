import java.util.Scanner;

public class AccountTest
{
	public static void main(String[] args)
	{
	    Scanner input = new Scanner(System.in);

	    //Account myName1 = new Account();

	    //System.out.printf("Initial name is %s%n%n", myName1.getName());

	    System.out.print("Enter your 1st name: ");
	    String name1 = input.nextLine();
	    Account myName1 = new Account(name1, 25.00);

	    System.out.print("Enter 2nd name: ");
	    String name2 = input.nextLine();
	    Account myName2 = new Account(name2, 0.00);

	    System.out.print("Enter the deposit of name 1: ");
	    double deposit1 = input.nextDouble();
	    myName1.deposit(deposit1);


	    System.out.print("Enter the deposit of name 2: ");
	    double deposit2 = input.nextDouble();
	    myName2.deposit(deposit2);

	    System.out.println("My 1st initial name is " + myName1.getName() + " and the deposit is " + myName1.getBalance());

	    System.out.printf("My 2nd initial name is %s and the deposit is %.2f .", myName2.getName(), myName2.getBalance());
	}
}