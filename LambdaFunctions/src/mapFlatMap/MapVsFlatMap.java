package mapFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

    public static void main(String[] args) {
        List<Customer> customers = CustomerDAO.getAll();

        List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());

        System.out.println(emails);

        List<Integer> ids = customers.stream().map(customer->customer.getId()).collect(Collectors.toList());

        System.out.println(ids);

        List<String> names = customers.stream().map(customer->customer.getName()).collect(Collectors.toList());

        System.out.println(ids);

        List<List<String>> numbers1 = customers.stream().map(customer -> customer.getPhoneNumber()).collect(Collectors.toList());

        System.out.println(numbers1);

        List<String> numbers = customers.stream().flatMap(customer -> customer.getPhoneNumber().stream()).collect(Collectors.toList());

        System.out.println(numbers);


    }

}
