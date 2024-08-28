interface Calculator {
    void display();
}

public class Example1 {

    public static void main(String[] args) {
        Calculator calculator = () -> {
            System.out.println("Anonymous method function");
            System.out.println("Calculator");
        };

        Calculator calculator1 = () -> System.out.println("Calculator");

        calculator.display();
        calculator1.display();
    }
}
