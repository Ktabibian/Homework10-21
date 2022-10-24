package lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class FirstLambda {
    public static void main(String[] args) {

        Supplier<String> supplier = () -> {
            System.out.println("I am inside the Supplier");
            return "Hello!";
        };

        String string = supplier.get();
        System.out.println("String = " + string);

        Consumer<String> consumer = (String s) -> {
            System.out.println("I am inside the Consumer");
            System.out.println(s);
        };
        consumer.accept("Hello!");
    }
}
