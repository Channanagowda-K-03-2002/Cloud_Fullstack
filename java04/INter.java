package java04;

public class INter implements In {
    @Override
    public void method1(int a) {
        System.out.println("Method 1 " + a);
    }

    @Override
    public int method2() {
        return 42;
    }
}