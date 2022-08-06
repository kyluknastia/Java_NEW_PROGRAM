package seconlesson;

import java.util.ArrayList;
import java.util.List;

public class Dispather {
    public static void main(String arg []) {
        Author author1=new Author("Nastia","em",'f');
        Author author2=new Author("Nastia","em",'f');
        Author author3=new Author("Nastia","em",'f');
        //System.out.println(author);
        Book book1 =new Book(author1,"Greate",898);
        Book book2 =new Book(author2,"Greate",888);
        Book book3 =new Book(author3,"Greate",558);
        //System.out.println(book);
        Book []books=new Book[3];
        books[0]=book1;
        books[1]=book2;
        books[2]=book3;

        for(Book temp:books){
            System.out.println(temp);
        }

        List<Book> bookList=new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        for(Book temp:bookList){
            System.out.println(temp);
        }
        /*for(int i=0;i<bookList.size();i++){
            System.out.println(bookList.get(i));
            }
         */
    }
}
