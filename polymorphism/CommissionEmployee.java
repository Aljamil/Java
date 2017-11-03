public class CommissionEmployee extends Employee
{
	private double grossSales;
	private double commissionRate;

	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, 
								double grossSales, double commissionRate)
	{
         super(firstName, lastName, socialSecurityNumber);

         if (commissionRate <= 0.0 || commissionRate >= 1.0)
         	System.out.println("Commission rate must be positive.");

         if (grossSales < 0.0)
         	System.out.println("Gross Sales must be positive.");

         this.grossSales = grossSales;
         this.commissionRate = commissionRate;
	}

	public void setCommissionRate(double commissionRate)
	{
		if (commissionRate <= 0.0 || commissionRate >= 1.0)
         	System.out.println("Commission rate must be positive.");

         this.commissionRate = commissionRate;
	}

	public void setGrossSale(double grossSales)
	{
		if (grossSales < 0.0)
         	System.out.println("Gross Sales must be positive.");

         this.grossSales = grossSales;
	}

	public double getCommissionRate()
	{
		return commissionRate;
	}

	public double getGrossSale()
	{
		return grossSales;
	}

	@Override
	public double earnings()
	{
		return getCommissionRate() * getGrossSale();
	}

	@Override
	public String toString()
	{
		return String.format("%s: %s%n%s: $%,.2f %s: %.2f", "Commission Employee: ", super.toString(), 
							 "Gross Sale: ", getGrossSale(), "Commission Rate: ", getCommissionRate());
	}


}