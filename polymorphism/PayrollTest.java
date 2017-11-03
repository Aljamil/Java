public class PayrollTest
{
	public static void main(String[] args)
	{
	   SalariedEmployee s = new SalariedEmployee("John", "Smith", "111", 800);
	   HourEmployee h = new HourEmployee("Karen", "Price", "222", 14.25, 40);
	   CommissionEmployee c = new CommissionEmployee("Sue", "Jones", "333", 1000, 0.6);
	   BaseCommissionEmployee b = new BaseCommissionEmployee("Bob", "Lewis", "444", 5000, .04, 300);

	   System.out.println("The individual employees and their earnings.\n");

	   System.out.println("Salary employee earned " + s.earnings());
	   System.out.println("Hourly employee earned " + h.earnings());
	   System.out.println("Commission employee earned " + c.earnings());
	   System.out.println("Base Commission employee earned " + b.earnings());

	   Employee[] employ = new Employee[4];

	   employ[0] = s;
	   employ[1] = h;
	   employ[2] = c;
	   employ[3] = b;

	   for (Employee current : employ)
	   {
	   	System.out.println(current);

	   	/*
	   	if current instanceof BaseCommissionEmployee()
	   	{
	   		BaseCommissionEmployee e = (BaseCommissionEmployee) current;
	   		e.setBaseSalary(1.10 * e.getBaseSalary());
			
			System.out.println("New Base Salary " + e.getBaseSalary() + ".");
	   	}

	   		System.out.println("New earnings: " + current.earnings());
	   		*/
	   }

	   	for(int j = 0; j < employ.length; j++){
	   		System.out.printf("Employe %d are %s%n", j, employ[j].getClass().getName());
	   	}

	}
}