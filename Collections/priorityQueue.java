import java.util.PriorityQueue;

public class priorityQueue
{
	public static void main(String[] args)
	{
	   PriorityQueue<Double> queue = new PriorityQueue<>();

	   queue.add(7.2);
	   queue.offer(3.5);
	   queue.offer(9.5);

	   for(Double d : queue)
	   {
	   	  System.out.printf("%.2f ", d);
	   }

	   System.out.println();

    
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