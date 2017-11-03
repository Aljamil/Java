import java.util.Stack;
import java.util.EmptyStackException;

public class stackPrac
{
	public static void main(String[] args)
	{
	   Stack <Integer> list = new Stack<>();

	   int[] a = {2, 4, 5, 6, 7, 3, 1};

	   for(int i : a)
	   {
	   	  list.push(a[i]);
	   	  printStack(list);
	   }


	   	try{
	   		int num;;

	   		while(true)
	   		{
	   			num = list.pop();

	   			System.out.printf("%nPopped %s%n", num);
	   			printStack(list);
	   		}
	   	}

	   	catch (EmptyStackException empty){
	   		empty.printStackTrace();
	   	}
	   
	   	  //list.pop();
	   	  //printStack(list);
	   

	   

	}


	private static void printStack(Stack <Integer> list)
	{
		if(list.isEmpty())
		{
			System.out.printf("Stack is empty.%n%n");
		}

		else
		{
			System.out.printf("%Stack contains %d (top) %n.", list);
		}
	}
}