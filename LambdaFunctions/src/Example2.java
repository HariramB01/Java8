
interface ArgumentLambdaFunction{
    void display(int age);
}

public class Example2 {
    public static void main(String[] args) {

        //Implementation type 1

        ArgumentLambdaFunction function = (age) -> {
            System.out.println(age);
        };

        //Implementation type 2

        ArgumentLambdaFunction function1 = System.out::println;

        //Implementation type 3

        ArgumentLambdaFunction function2 = (age) -> System.out.println("Age : "+age);

        function.display(23);
        function1.display(33);
        function1.display(43);
    }
}
