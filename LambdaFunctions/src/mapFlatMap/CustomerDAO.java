package mapFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDAO {

    public static List<Customer> getAll(){
        return Stream.of(
                new Customer(1,"Hari","bhariram01@gmail.com", Arrays.asList("6383561251","6383561252")),
                new Customer(2,"Harish","hariramb01@gmail.com", Arrays.asList("6383561253","6383561254")),
                new Customer(3,"Hariram","hariram01@gmail.com", Arrays.asList("6383561255","6383561256"))
        ).collect(Collectors.toList());
    }

}
