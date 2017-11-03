
public class BasePlusCommissionEmployee extends CommissionEmployee
{
	
	private double baseSalary;

	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, 
								double grossSales, double commissionRate, double baseSalary)
	{

		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		

		if (baseSalary < 0.0)
			throw new IllegalArgumentException("Gross sales must be >= 0.0");

		
		this.baseSalary = baseSalary;
	}


	public void setBaseSalary(double baseSalary)
	{
		if (baseSalary < 0.0)
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary()
	{
		return baseSalary;
	}

	public double earnings()
	{
		return baseSalary + super.earnings();
	}



	@Override
	public String toString(){
		return String.format("%s%n%s: %.2f%n%s: %.2f %n", super.toString(), "Base Salary: ", baseSalary,
							"Earned: ", earnings());
	}

}