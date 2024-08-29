package filter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class FilterDemo1 {

    public static void main(String[] args) {

        Predicate<Integer> predicate = (t) -> {
            return t%2==0;
        };

        Predicate<Map.Entry<Integer,String>> predicate1 = (entry) -> {
            return entry.getKey()%2==0;
        };

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        list.stream().filter(predicate).forEach(System.out::println);


        System.out.println("------------------------------------");
        list.stream().filter(t->t%2==0).forEach(System.out::println);
        System.out.println("------------------------------------");
        List<String> list1 = Arrays.asList("Harish", "Gokul","Sathish","Poorna");
        list1.stream().filter(s->s.contains("a")).forEach(System.out::println);
        System.out.println("------------------------------------");
        Map<Integer, String> hm = new HashMap<>();
        hm.put(1,"Harish");
        hm.put(2,"Gokul");
        hm.put(3,"Sathish");
        hm.put(4,"Poorna");
        hm.entrySet().stream().filter(predicate1).forEach(System.out::println);
        System.out.println("------------------------------------");
        hm.entrySet().stream().filter(key->key.getKey()%2==0).forEach(obj->System.out.println(obj));
        System.out.println("------------------------------------");
        hm.entrySet().stream().filter(key->key.getKey()%2==0).forEach(System.out::println);

    }

}
