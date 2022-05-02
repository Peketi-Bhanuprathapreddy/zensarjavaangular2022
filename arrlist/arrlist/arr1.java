package arrlist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class arr1{

public static List<Integer> convertIntoList(){ 
    int[] arr = {10, 15, 45, 67, 98};

    // ArrayList<Integer[]> list = Arrays.asList(arr);
    List<Integer> list = new ArrayList<>();

    for (int e : arr) {
        list.add(e);
        System.out.println(e);
    }

    return list;
}

    public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(10); // 0
    list.add(39); // 1
    list.add(-98); // 2
    list.add(90);
    list.add(2, 30);
    System.out.println(list.contains(90));
    System.out.println(list.indexOf(90));
    
    System.out.println(list.size());
    System.out.println(list.get(1));
    //remove = list.remove(2); // 3
    System.out.println(list);
   
    System.out.println("Iterator :-");
    Iterator<Integer> it = list.iterator();

    while(it.hasNext()) {
        System.out.println(it.next());
    }

    }
}

