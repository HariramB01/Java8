package example4;

import java.util.Arrays;
import java.util.List;

public class BookRepo {

    static List<Book> books = Arrays.asList(
            new Book(1, "Harry Potter", 350),
            new Book(2, "Game of Thrones", 500)
    );

    public static List<Book> getBooks(){
        return books;
    }

}