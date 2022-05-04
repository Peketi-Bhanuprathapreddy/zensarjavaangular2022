package arrlist;
import java.util.Stack;

public class stackex {
    public static void main(String[] args)
    {
     Stack<Integer> s=new Stack<>();
     s.push(20);
     s.push(50);
     s.push(30);
     s.push(60);
     s.pop();
     s.pop();  
      s.pop();
      System.out.println(s.isEmpty());
    s.forEach(System.out::println);
    }
    
}
