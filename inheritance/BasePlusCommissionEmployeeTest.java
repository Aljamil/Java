public class BasePlusCommissionEmployeeTest
{
	public static void main(String[] args)
	{
		BasePlusCommissionEmployee e = new BasePlusCommissionEmployee("Sue", "Jones", "222", 100, .06, 200);
		CommissionEmployee a = new CommissionEmployee("Anne", "Ancheta", "333", 200, .05);

		System.out.println("Employee information obtained by get methods: ");
		System.out.printf("%s %s%n", "First name is: ", e.getFirstName());
		System.out.printf("%s %s%n", "Last name is: ", e.getLastName());
		System.out.printf("%s %s%n", "SSS number is: ", e.getSocialSecurityNumber());
		System.out.printf("%s %.2f .%n", "Gross sale is: ", e.getGrossSale());
		System.out.printf("%s %.2f .%n", "Commission Rate is: ", e.getCommissionRate());
		System.out.printf("%s %.2f .%n", "Base Salary is: ", e.getBaseSalary());
		System.out.printf("%s %.2f .%n", "Earned: ", e.earnings());

		e.setBaseSalary(300);
		e.setGrossSale(5000);
		e.setCommissionRate(.1);

		System.out.println("UPDATED:");
		System.out.print(e);

/*
		System.out.printf("%s %s%n", "First name is: ", a.getFirstName());
		System.out.printf("%s %s%n", "Last name is: ", a.getLastName());
		System.out.printf("%s %s%n", "SSS number is: ", a.getSocialSecurityNumber());
		System.out.printf("%s %.2f .%n", "Gross sale is: ", a.getGrossSale());
		System.out.printf("%s %.2f .%n", "Commission Rate is: ", a.getCommissionRate());
		//System.out.printf("%s %.2f .%n", "Base Salary is: ", a.getBaseSalary());
		System.out.printf("%s %.2f .%n", "Earned: ", a.earnings());


		System.out.println("\n\n");

		a = e;

		System.out.printf("%s %s%n", "First name is: ", a.getFirstName());
		System.out.printf("%s %s%n", "Last name is: ", a.getLastName());
		System.out.printf("%s %s%n", "SSS number is: ", a.getSocialSecurityNumber());
		System.out.printf("%s %.2f .%n", "Gross sale is: ", a.getGrossSale());
		System.out.printf("%s %.2f .%n", "Base Salary is: ", ((BasePlusCommissionEmployee)a).getBaseSalary()); */
	}
}