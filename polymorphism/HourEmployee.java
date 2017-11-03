public class HourEmployee extends Employee
{
	private double hour;
	private double wage;

	public HourEmployee(String firstName, String lastName, String socialSecurityNumber,
						double hour, double wage)
	{
		super(firstName, lastName, socialSecurityNumber);

		if(wage < 0.0)
		{
			System.out.println("Wage must be positive.");
		}

		if (hour < 0.0 || hour > 168.0)
		{
			System.out.println("Hours must be >= 0 and <= 168.0");
		}

		this.hour = hour;
		this.wage = wage;
	}

	public void setHour(double hour)
	{
		if (hour < 0.0 || hour > 168.0)
		{
			System.out.println("Hours must be >= 0 and <= 168.0");
		}

		this.hour = hour;
	}

	public void setWage(double wage)
	{
		if(wage < 0.0)
		{
			System.out.println("Wage must be positive.");
		}

		this.wage = wage;
	}

	public double getHour()
	{
		return hour;
	}

	public double getWage()
	{
		return wage;
	}


    @Override
	public double earnings()
	{
		if(getHour() <= 40)
			return getWage() * getHour();
		else
			return 40 * getWage() + (getHour() - 40) * getWage() * 1.5;
	}

	@Override
	public String toString()
	{
		return String.format("Hourly Employee: %s%n%s: $%.2f; %s: %,.2f", 
					super.toString(), "hourly wage: ", getWage(), "hours worked: ", 
					getHour());
	}
}