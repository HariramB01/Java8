package supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo1 {

    public static void main(String[] args) {
        Supplier<String> supplier = ()->{
            return "Hi Hariram";
        };
//        System.out.println(supplier.get());

//        List<String> list = Arrays.asList("a","b");

        List<String> list = Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(supplier));


    }

}
