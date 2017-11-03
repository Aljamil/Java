
import java.util.*;
import java.io.*;

public class CommissionEmployeeTest
{
	public static void main(String[] args)
	{
		CommissionEmployee e = new CommissionEmployee("Sue", "Jones", "222", 100, .06);

		System.out.println("Employee information obtained by get methods: ");

		System.out.printf("%s %s%n", "First name is: ", e.getFirstName());

		System.out.printf("%s %s%n", "Last name is: ", e.getLastName());

		System.out.printf("%s %s%n", "SSS number is: ", e.getSocialSecurityNumber());

		System.out.printf("%s %.2f .%n", "Gross sale is: ", e.getGrossSale());

		e.setGrossSale(5000);
		e.setCommissionRate(.1);

		System.out.println("UPDATED:");
		System.out.print(e);
	}
}