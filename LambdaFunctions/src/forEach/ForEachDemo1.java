package forEach;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo1 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,4,5,6,7,8);
        list.stream().forEach(t->System.out.print(t+" "));
        System.out.println();
        list.forEach(t->System.out.print(t+" "));
        System.out.println();
        list.forEach(System.out::print);




        System.out.println();
        Map<Integer,String> hm = new HashMap<>();
        hm.put(1,"Hariram");
        hm.put(2,"Harish");
        hm.put(3,"Hari");
        hm.put(4,"Hariharan");
        hm.put(5,"Harie");


        hm.forEach((key, value)-> System.out.println(key+" : "+value));


        System.out.println();
        hm.entrySet().stream().forEach(obj->System.out.println(obj));
        System.out.println();
        hm.entrySet().forEach(obj->System.out.println(obj));
        System.out.println();
        hm.entrySet().forEach(System.out::println);

    }
}
