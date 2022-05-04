package arrlist;
import java.util.ArrayDeque;
import java.util.Queue;

public class que {
  
    public static void main(String[] args)
    {
      Queue<Integer> q= new ArrayDeque<>();
      q.offer(5110);
      q.offer(503);
      q.offer(510);
      q.offer(520);
     // q.poll();
     System.out.println( "hi ra"+q.size());
    q.add(33);
      q.add(12);
    // q.clear();
    // q.remove();
    // System.out.println( "head is"+q.element());
     System.out.println( "head is"+q.peek());
    System.out.println(q);
    }
    
}
