
package Letter;


import java.util.Scanner;

public class LetterTest {
	
	public static boolean isOdd(int a)
	{
		return a % 2 != 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Letter[] alpha = new Letter[3];
		int size;
		
		System.out.print("Enter the size: ");
		size = in.nextInt();
		
		
		if(isOdd(size))
		{
			if(size >= 3)
			{
			  alpha[0] = new X(size);
			  alpha[1] = new Y(size);
			  alpha[2] = new Z(size);
			  
			  alpha[0].printLetter();
			  alpha[1].printLetter();
			  alpha[2].printLetter();
			}
			
			else
			{
				System.out.println("Size must be greater or equal to 3.");
			}
			
			
		}
		
		else
		{
			System.out.println("Size must be odd number.");
		} 
		
		/*
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size; j++)
			{
				System.out.printf("%d ", size - 1);
			}
			
			System.out.println();
		}*/

	}

}
