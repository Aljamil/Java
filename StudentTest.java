
import java.util.Scanner;

public class StudentTest
{
	public static void main(String[] args)
	{
       
       Scanner input1 = new Scanner(System.in);
       Scanner input2 = new Scanner(System.in);

       Scanner com = new Scanner(System.in);

       String command, student;
       double ave;

       System.out.print("Enter EXIT if terminate the program: ");
       command = com.nextLine();
      
       while(!"EXIT".equals(command))
       {

       System.out.print("Enter name: ");
       student = input1.nextLine();

       System.out.print("Enter average: ");
       ave = input2.nextDouble();

       Student student1 = new Student(student, ave);

       System.out.printf("The name of student is %s.%nThe average of %s is %.2f.%nThe Letter Grade is %s . %n", student1.getName(), student1.getName(), student1.getAverage(), student1.getLetterGrade());


       System.out.print("Enter EXIT if terminate the program: ");
       command = com.nextLine();

       }
	}
}