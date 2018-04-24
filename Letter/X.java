
package Letter;

public class X implements Letter 
{
  private int x;
  X(int x)
  {
	  this.x = x;
  }
  
  public void setX(int X)
  {
	 x = X;
  }
  
  public int getX()
  {
	  return x;
  }
  
  
  @Override
  public void printLetter()
  {
	  for(int i = 1; i <= x; i++)
		{
			
			for(int j = 1; j <= x; j++)
			{
				
				if(i == j || i + j == x + 1)
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
