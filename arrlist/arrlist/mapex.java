package arrlist;
import java.util.Map;
import java.util.HashMap;

public class mapex {
    public static void main(String[] args){
         Map<String,Integer> map =new HashMap<>();
System.out.println("map is empty"+ map.isEmpty());
map.put("bhanu",1);
map.put("jhanu",12);
map.put("ghan",21);
System.out.println("map is empty"+ map.isEmpty());
System.out.println(" bhanu" +map.get("bhanu"));
System.out.println(" jhanu" +map.get("jhanu"));
System.out.println("Key : Arya is there ? " + map.containsKey("jhanu"));

//map.remove("bhanu");
System.out.println("bhanu is removed");
System.out.println("Value : 12 is there ? " + map.containsValue(1));
map.forEach((k, v) -> {
    System.out.println("Key : " + k + ", value : " + v);
    });
    
}
}
