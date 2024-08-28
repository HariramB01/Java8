package predicate;

import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {

    public static void main(String[] args) {
        PredicateDemo demo = new PredicateDemo();
        System.out.println(demo.test(1)?"Even":"Odd");
    }

    @Override
    public boolean test(Integer age) {
        return age%2==0;
    }
}
