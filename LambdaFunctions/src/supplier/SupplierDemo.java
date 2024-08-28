package supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo implements Supplier<String> {

    public static void main(String[] args) {
        SupplierDemo demo = new SupplierDemo();
        System.out.println(demo.get());
    }

    @Override
    public String get() {
        return "Hello, Hariram";
    }
}
