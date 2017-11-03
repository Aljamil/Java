import java.util.Scanner;

public class compareStr
{
	public static void main(String[] args)
	{


		Scanner input = new Scanner(System.in);
		System.out.print("Enter String1: ");
		String str1 = input.nextLine();

		System.out.print("Enter String2: ");
		String str2 = input.nextLine();


		if(str1.equals(str2)){
		System.out.println("Str1 is equal to Str2.");
        }
		else{
			System.out.println("Str1 is not equal to Str2.");
		}

		if(str1.equalsIgnoreCase(str2)){
		System.out.println("Str1 is equal to Str2 with ignore caes.");
        }
		else{
			System.out.println("Str1 is not equal to Str2 with ignore case.");

		}

		if(str1 == str2){
		System.out.println("Str1 is equal to Str2.");
        }
		else{
			System.out.println("Str1 is not equal to Str2.");

		}


		System.out.printf("Str1 is compare to Str2 %d%n", str1.compareTo(str2));
		System.out.printf("Str2 is compare to Str1 %d%n", str2.compareTo(str1));



		if(str1.regionMatches(5, str2, 5, 3))
		{
			System.out.println("Str1 is match to Str2.");
		}

		else{
			System.out.println("Str1 is do not to Str2.");
		}


		if(str1.regionMatches(true, 5, str2, 5, 3))
		{
			System.out.println("Str1 is match with ignore case to Str2.");
		}

		else{
			System.out.println("Str1 is do not match with ignore case to Str2.");
		}


	}

}