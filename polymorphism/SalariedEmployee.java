public class SalariedEmployee extends Employee
{
	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber,
							double weeklySalary)
	{
		super(firstName, lastName, socialSecurityNumber);

		if(weeklySalary < 0.0)
		  throw new IllegalArgumentException("Must be positive number.");

		  this.weeklySalary = weeklySalary;	
	}

	public void setWeeklySalary(double weeklySalary)
	{
		if(weeklySalary > 0.0)
		  throw new IllegalArgumentException("Must be positive number.");

		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary()
	{
		return weeklySalary;
	}

	@Override
	public double earnings()
	{
		return getWeeklySalary();
	}

	@Override
	public String toString()
	{
		return String.format("Salaried Employee: %s%n%s: %.2f", super.toString(), 
							"Weelkly Salary: ", getWeeklySalary());
	}
}