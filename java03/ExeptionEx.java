package java03;
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExeptionEx {
   
    public static void main(String[] args) {
        try {
            int a=1;
            if(a>5) {
                throw new CustomException("Value of a is greater than 5.");
            }
            
        } catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
