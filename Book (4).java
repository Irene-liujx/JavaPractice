package B12_05;

import java.util.Comparator;
import java.util.Scanner;

public class Book implements Comparable<Book>{
    //唯一识别码
    public String ISBN;
    public String title;
    public int price;
    public String author;

    @Override
    public boolean equals(Object obj) {
        //判断obj是否为空
        if(obj == null){
            return false;
        }

        //判断obj是否为Book类
        if (!(obj instanceof Book)) {
            return false;
        }
        //向下转型
        Book book = (Book)obj;
        //根据需要比较
        return this.ISBN.equals(book.ISBN);
    }

    @Override
    public int compareTo(Book o){
        return this.price - o.price;
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.ISBN = "23333";
        book1.title = "nee";
        book1.price = 12;
        book1.author = "wo";
        Book book2 = new Book();
        book2.ISBN = "23333";
        book2.title = "nee";
        book2.price = 12;
        book2.author = "wo";
    /*
        System.out.println(book1 == book2);
        System.out.println(book1.equals(book2));

        System.out.println(book1.compareTo(book2));
        */

     Scanner sc= new Scanner(System.in);
     String line = sc.nextLine();
     //按价格比较
     if(line.equalsIgnoreCase("价格")){
         int r = book1.compareTo(book2);
         System.out.println(r);
     }else if(line.equalsIgnoreCase("书名")){
          //按书名比较
         Comparator<Book> c = new TitleComparator();
         int r = c.compare(book1,book2);
         System.out.println(r);
     }else if(line.equalsIgnoreCase("作者")){
         //按作者名比较
         Comparator<Book> c = new AuthorComparator();
         int r = c.compare(book1,book2);
         System.out.println(r);
     }

    }
}
