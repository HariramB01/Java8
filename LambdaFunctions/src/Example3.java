interface ReturnArgumentMethod{
    int multiply(int a, int b);
}

public class Example3 {
    public static void main(String[] args) {

        //Implementation type 1

        ReturnArgumentMethod method = (a,b)->{
            return a*b;
        };

        //Implementation type 2

        ReturnArgumentMethod method1 = (a,b) -> { return a*b; };

        //Implementation type 3

        ReturnArgumentMethod method2 = (a,b) -> a*b ;


        System.out.println(method.multiply(5,4));

        System.out.println(method1.multiply(10,4));

        System.out.println(method2.multiply(20,4));

    }
}
