import java.util.Scanner;

public class Fibonacci{

	public static int fibo (int num)
	{
		if(num == 0){
			return 0;
		}

	   else if(num == 1)
      		return 1;
		
		else{
			return fibo(num - 2) + fibo(num - 1);
		}
	}



	public static void main(String[] args)
	{
	    int x, n;     
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the number: ");
	    x = input.nextInt();

	    System.out.print("The Fibonacci is " + fibo(x));
	    

	    System.out.println();

	}

	
}