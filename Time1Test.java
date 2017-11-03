
import java.util.Scanner;

public class Time1Test
{
	public static void main(String[] args)
	{
		int a, b, c;

		Scanner hour = new Scanner(System.in);
		Scanner minute = new Scanner(System.in);
		Scanner second = new Scanner(System.in);

		Scanner input = new Scanner(System.in);

		System.out.print("Enter what time is ti? ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();

		Time1 time = new Time1(a,b,c);
		Time1 time1 = new Time1();
		Time1 time2 = new Time1(a,0,0);
		Time1 time3 = new Time1(a,b,0);
		Time1 time4 = new Time1(time);

		//time.setTime(a,b,c);

		displayTime("The time is: ", time);

		
			try{ Time1 time5 = new Time1(a,b,c); }

			catch(IllegalArgumentException e){
				System.out.printf("Exception: %s%n%n", e.getMessage());
			}
		
		
	}

	private static void displayTime(String header, Time1 t)
	{
		System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", header, t.universalTime(), t.standardTime());
	}
}