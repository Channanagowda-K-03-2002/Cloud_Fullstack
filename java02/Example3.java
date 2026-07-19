public class Example3 {
    public void exercise1(){
        int x = 5; 
        System.out.println(x++ + " " + ++x); 
        for (int i = 10; i > 0; i -= 3) System.out.print(i + " "); 
        System.out.println();
        int a = 100; if (a % 3 == 0) System.out.println("Fizz"); else if (a % 5 == 0) System.out.println("Buzz"); else System.out.println(a);
    }
    
    public double calculateTemperature(double celsius) {
        return (celsius * 9/5.0f) + 32; 
    }

    public void reverseString(String str){
        String oriString = str;
        String revStr = "";
        for(int i=str.length()-1;i>=0;i--){
            revStr += str.charAt(i);
        }
        System.out.println(revStr);
    }

    public static void main(String[] args) {
        Example3 example = new Example3();
        //System.out.println("Temperature in Fahrenheit: " + example.calculateTemperature(3));  
        example.reverseString("jai"); 
       
    }
}