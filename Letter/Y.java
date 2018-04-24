
package Letter;

public class Y implements Letter 
{
	
	 private int y;
	  Y(int y)
	  {
		  this.y = y;
	  }
	  
	  public void setY(int Y)
	  {
		 y = Y;
	  }
	  
	  public int getY()
	  {
		  return y;
	  }
	
	@Override
	public void printLetter()
	{
		System.out.println("\n");
		
		for(int i = 0; i < y; i++)
		{
			for(int j = 0; j < y; j++)
			{
				if((i == j || i + j == y - 1) && (i < y / 2 + 1) || i > y / 2 && j == y / 2)
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
