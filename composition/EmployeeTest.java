

package composition;

import java.util.Scanner;

public class EmployeeTest
{
	public static void main(String[] args)
	{
	  int d, m, y;
	  String l, f;

	  Scanner input = new Scanner(System.in);
	  Scanner input1 = new Scanner(System.in);
	  

	  System.out.print("Enter the date of birth date(mm-dd-yyyy): ");
	  m = input.nextInt();
	  d = input.nextInt();
	  y = input.nextInt();

	  Date b = new Date(m,d,y);

	  System.out.print("Enter the date of hired date(mm-dd-yyyy): ");
	  m = input.nextInt();
	  d = input.nextInt();
	  y = input.nextInt();

	  Date h = new Date(m,d,y);


	  System.out.print("Enter your lastname: ");
	  l = input1.nextLine();
	  System.out.print("Enter your firstname: ");
	  f = input1.nextLine();

	  Employee e = new Employee(f, l, b, h);


	  System.out.printf("%n%s%n", e.toString());



	  System.out.printf("%n%s%n", e.getCount());

	}
}