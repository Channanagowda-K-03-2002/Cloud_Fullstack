public class Loops {
    public static void main(String[] args) {
        // For loop example
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // While loop example
        System.out.println("\nWhile loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Iteration: " + j);
            j++;
        }

        // Do-while loop example
        System.out.println("\nDo-while loop:");
        int k = 1;
        do {
            System.out.println("Iteration: " + k);
            k++;
        } while (k <= 5);

        // Switch statement example
        System.out.println("\nSwitch statement:");
        int day = 3; // 
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            default: System.out.println("Weekend");
        }

        // Nested loop example
        System.out.println("\nNested loop:");
        for (int i = 1; i <= 3; i++) {
            for (int m = 1; m <= 3; m++) {
                System.out.println("Iteration: " + i + ", " + m);
            }
        }
    }
}
