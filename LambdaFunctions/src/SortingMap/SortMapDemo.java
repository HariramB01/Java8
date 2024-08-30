package SortingMap;

import java.util.*;

public class SortMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();
        hm.put("eight",8);
        hm.put("four",4);
        hm.put("ten",10);
        hm.put("two",2);

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(hm.entrySet());

//        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                return o2.getKey().compareTo(o1.getKey());
//            }
//        });

        Collections.sort(entries, ( o1,o2) ->  o2.getKey().compareTo(o1.getKey()));

        for(Map.Entry<String, Integer> entry : entries){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println("---------------------------------");

        hm.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("---------------------------------");

        hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);


    }

}
