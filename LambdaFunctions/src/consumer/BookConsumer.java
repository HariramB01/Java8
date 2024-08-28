package consumer;

import example4.Book;
import example4.BookRepo;

import java.util.List;
import java.util.function.Consumer;

public class BookConsumer {


    public static void main(String[] args) {
        List<Book> books = BookRepo.getBooks();

        Consumer<Book> consumer = (book) -> System.out.println(book.toString());

        books.stream().forEach(book -> consumer.accept(book));
        System.out.println("---------------------------");
        books.forEach(book -> consumer.accept(book));
        System.out.println("---------------------------");
        books.forEach(consumer::accept);
        System.out.println("---------------------------");
        books.forEach(consumer);
    }

}
