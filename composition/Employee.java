


package composition;


public class Employee{
	

	private static int count;
	private String firstName, lastName;
	private Date hireDate, birthDate;

	public Employee(String firstName, String lastName, Date birthDate, Date hireDate)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.hireDate = hireDate;
		this.birthDate = birthDate;

		++count;
	}

	public String toString()
	{
	return String.format("%s, %s%nBirth Date: %s%nHired: %s%n", lastName, firstName, birthDate, hireDate);
	}

	public static int getCount()
	{
		return count;
	}
}