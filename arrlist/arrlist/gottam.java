package arrlist;
import java.util.ArrayList;
import java.util.List;
public class addelements 
{

public static List<Integer> convertIntoList(){ 
    public static void main(String[] args){
    int[] arr = {10, 15, 45, 67, 98};

    // ArrayList<Integer[]> list = Arrays.asList(arr);
    List<Integer> list = new ArrayList<>();

    for (int e : arr) {
        list.add(e);
        System.out.println(e);
    }

    return list;
}
}
}
