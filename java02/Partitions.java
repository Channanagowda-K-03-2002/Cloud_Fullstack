import java.util.*;

public class Partitions {
    
    public void countPartitions(int n) {
        long[] dp = new long[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                dp[j] = dp[j] + dp[j - i];
            }
        }

        System.out.println("Number of partitions of " + n + ": " + dp[n]);
        System.out.println("Partitions of " + n + ":");
    
    }

    static void printPartitions(int n, int max, List<Integer> current) {

        // A complete partition is found
        if (n == 0) {
            for (int i = 0; i < current.size(); i++) {
                System.out.print(current.get(i));
                if (i != current.size() - 1)
                    System.out.print(",");
            }
            System.out.println();
            return;
        }

        // Try numbers from largest to smallest
        for (int i = Math.min(max, n); i >= 1; i--) {
            current.add(i);
            printPartitions(n - i, i, current);
            current.remove(current.size() - 1); // backtrack
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Partitions partition = new Partitions();
        partition.countPartitions(n);
        printPartitions(n, n, new ArrayList<>());
    }
    
}


