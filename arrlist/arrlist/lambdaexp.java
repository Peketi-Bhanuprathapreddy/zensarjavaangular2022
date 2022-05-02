package arrlist;

public class lambdaexp {
    public static void main(String[] args) {
        inex in = () -> System.out.println("Aaryan");
        impl i = new impl();

        i.start();
        in.start();
    }
    
}
