package BookStratagy;

import java.util.ArrayList;
import java.util.List;

public class BookDriver {
    public static void main(String args[])
    {
        List<Book> books = new ArrayList<>();
        Book book;

        book = new HorrorBook();
        book.setCoverBehaviour(new HardCover());

        books.add(book);

        System.out.println(book.display());
        System.out.println(book.cover());
//        book = new ThrillerBook();
//        book.setCoverBehaviour(new SoftCover());
//        books.add(book);

//        for (Book coverBook : books)
//        {
//            System.out.println(coverBook.display());
//            System.out.println(coverBook.cover());
//            System.out.println("-------------------------");
//        }

    }
}
