
package Letter;

public class Z implements Letter 
{
	
	private int z;
	
	Z(int z)
	{
		this.z = z;
	}
	
	public void setZ(int Z)
	{
		z = Z;
	}
	
	public int getZ()
	{
		return z;
	}
	
	@Override
	public void printLetter()
	{
		System.out.println("\n");
	   for(int i = 0; i < z; i++)
	   {
		   for(int j = 0; j < z; j++)
		   {
			   if((i == 0 || i + j == z - 1) || i == z - 1)
			   {
				   System.out.print("*");   
			   }
			   
			   else
			   {
				   System.out.print(" ");
			   }
		   }
		   
		   System.out.println();
	   }
	}

}
