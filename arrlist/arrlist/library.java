package arrlist;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayDeque;

 public class library{
  static Queue<book> q=new ArrayDeque<>();
  
     public  static book bookdetails()
      {
 Scanner sc=new Scanner(System.in);
 Scanner sc1=new Scanner(System.in);
 Scanner sc2=new Scanner(System.in);
 Scanner sc3=new Scanner(System.in);
 System.out.println("book name-");
String book=sc.nextLine();
System.out.println("price-");
int price=sc1.nextInt();
System.out.println("author-");
String author=sc2.nextLine();
System.out.println("est_year-");
int est_year=sc3.nextInt();
book b=new book(book, price, author, est_year);
return b;
  }
  public static void main(String[] args) {
    book b =bookdetails();
    q.add(b);

    q.forEach(e -> {
        System.out.println("Name : " + b.getName());
        System.out.println("price: " + b.getPrice());
        System.out.println("author : " + e.getAuthor());
        System.out.println("est-year : " + e.getEst_year());
    });


}

 }

 class book {
    String name;
    int price;
    String author;
    int est_year;
    public book(String name, int price, String author, int est_year) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.est_year = est_year;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getEst_year() {
        return est_year;
    }
    public void setEst_year(int est_year) {
        this.est_year = est_year;
    }
       
}
