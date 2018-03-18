import java.util.PriorityQueue;

public class priorityQueue
{
	public static void main(String[] args)
	{
	   PriorityQueue<Double> queue = new PriorityQueue<>();

	   queue.offer(7.2);
	   queue.offer(3.5);
	   queue.offer(9.5);

    
	   while(queue.size() > 0)
	   {
	   	  System.out.printf("%.2f ", queue.peek());
	   	  queue.poll();
	   }

	   System.out.printf("%.2f ", queue.peek());
	   System.out.printf("%.2f ", queue.peek());
	   System.out.printf("%.2f ", queue.peek());

	   System.out.println();
	}
}