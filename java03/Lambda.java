package java03;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface MyFunctionalInterface {
    void myMethod();
}

public class Lambda implements MyFunctionalInterface {
    @Override
    public void myMethod() {
        System.out.println("My method is called.");
    }

    // Using a lambda expression to implement the interface
    MyFunctionalInterface lambdaImplementation = () -> System.out.println("Lambda implementation of myMethod.");
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2); 
        numbers.add(3);
        numbers.add(4);
        numbers.add(5); 
        // for (Integer integer : numbers) {
        //     System.out.println(integer);
        // }
        numbers.forEach(t -> System.out.println(t));
        //numbers.forEach(System.out::println);
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println(number);
        }
    
    }
}
