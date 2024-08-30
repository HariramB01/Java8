package SortingMap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortMapDemo1 {

    public static void main(String[] args) {
//        Map<Employee, Integer> hm = new TreeMap<>(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return (int) (o2.getSalary()-o1.getSalary());
//            }
//        });

        Map<Employee, Integer> hm = new TreeMap<>((o1, o2) -> (int) (o1.getSalary()-o2.getSalary()));

        hm.put(new Employee(1,"Harish","Mech",50000),50);
        hm.put(new Employee(2,"Hariram","Civil",40000),40);
        hm.put(new Employee(3,"Hari","CSE",100000),100);
        hm.put(new Employee(4,"Harie","IT",90000),90);
        hm.put(new Employee(5,"Hariharan","Auto",30000),30);


//        System.out.println(hm);

        hm.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDepartment).reversed()))
                .forEach(System.out::println);




    }

}
