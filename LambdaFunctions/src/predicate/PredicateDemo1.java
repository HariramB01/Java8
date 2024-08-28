package predicate;

import example4.Book;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo1{

    public static void main(String[] args) {

        Predicate<Integer> predicate = (age) -> {
            return age >= 18;
        };

        Predicate<Integer> predicate1 = (age) -> age >= 18;

        List<Integer> list = Arrays.asList(25,10,20,87,17);
        list.stream().forEach(age -> System.out.println(predicate.test(age) + " "+ age ));
        System.out.println("---------------------");
        list.stream().filter(predicate1).forEach(age -> System.out.println("Age : "+ age ));
        System.out.println("---------------------");
        list.stream().filter((age)->age<18).forEach(age -> System.out.println("Age : "+ age ));
    }

}
