package consumer;

import java.util.function.Consumer;

public class ConsumerDemo1 implements Consumer<Integer> {
    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }

    public static void main(String[] args) {
        ConsumerDemo1 demo = new ConsumerDemo1();
        demo.accept(10);
    }
}
