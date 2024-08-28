package example4;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    public List<Book> getBooks(){
        List<Book> books = BookRepo.getBooks();

        //Implement type 1

//        Collections.sort(books, new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                return o2.getName().compareTo(o1.getName());
//            }
//        });

        //Implement type 2

//        books.sort( new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                return o2.getName().compareTo(o1.getName());
//            }
//        });

        //Implement type 3

//        Collections.sort(books, (o1, o2) -> {
//            return o1.getName().compareTo(o2.getName());
//        });

        //Implement type 4

//        books.sort((o1, o2) -> {
//            return o1.getName().compareTo(o2.getName());
//        });

        //Implement type 5 (without return)

        books.sort((o1, o2) -> o1.getName().compareTo(o2.getName()) );

        return books;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBooks());
    }

}

//class MyComparator implements Comparator<Book>{
//
//    public int compare(Book o1, Book o2) {
////        return o1.getName().compareTo(o2.getName());
//        // o1 -> o2 ascending
//        // o2 -> o1 descending
//
//        return Double.compare(o2.getPrice(), o1.getPrice());
//    }
//}