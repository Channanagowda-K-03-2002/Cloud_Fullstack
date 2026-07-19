//package java02
public class Example2 {
    public void factorial(){
        int n = 15, fact = 1; 
        for (int i = 1; i <= n; i++) 
            {
                 fact *= i; 
            } 
            System.out.println("the factorial of " + n + " = " + fact);
    }

    public void fibonacci(int n) {
        int a = 0, b = 1; 
        System.out.print(a + " " + b + " "); 
        for (int i = 2; i < n; i++) 
            { 
                int c = a + b; 
                System.out.print(c + " "); 
                a = b; 
                b = c; 
            }
        System.out.println(); 
    }

    public boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Example2 obj = new Example2();
        obj.factorial();
        obj.fibonacci(13);
        int m = 17;
        System.out.println("Is " + m + " prime? " + obj.isPrime(m));
        String str = "12322";
        System.out.println("Is \"" + str + "\" a palindrome? " + obj.isPalindrome(str));
    }    
}