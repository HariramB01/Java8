package consumer;

import example4.Book;
import example4.BookRepo;

import java.util.*;
import java.util.function.Consumer;

public class ConsumerDemo2 {

    public static void main(String[] args) {

        Consumer<Integer> consumer = (age)->{
            System.out.print(age);
        };

        Consumer<Integer> consumer1 = (age)-> System.out.print(age);

        Consumer<Integer> consumer2 = System.out::print;


        consumer.accept(23);
        System.out.println();
        consumer1.accept(33);
        System.out.println();
        consumer2.accept(43);
        System.out.println();


        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        list.stream().forEach(consumer);
        System.out.println();

        list.forEach(consumer1);
        System.out.println();

        list.stream().forEach(t->System.out.println("print : "+t));


    }
}
