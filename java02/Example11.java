public class Example11 {
    public void swap(int a, int b) {
        int temp = a; 
        a = b; 
        b = temp; 
        System.out.println("Inside swap method: a=" + a + ", b=" + b);
    }

    public void largestNumber(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest number is: " + max);
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public double simpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
    
    public static void main(String[] args) {
        Example11 example = new Example11();
        int a = 5, b = 10;
        example.swap(a, b);
        int[] numbers = {3, 7, 2, 9, 10};
        example.largestNumber(numbers);
        System.out.println("Is this number even? " + example.isEven(4));
        System.out.println("Is this number even? " + example.isEven(5));
        System.out.println("Simple interest is: " + example.simpleInterest(1000, 5, 2));
    }
}
