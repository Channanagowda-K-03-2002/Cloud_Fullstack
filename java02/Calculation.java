public class Calculation {
    public int calculateSum(int[] arr) {
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            return sum;
    }

    public int calculateMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public int calculateMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public int calculateAverage(int[] arr) {
        int sum = calculateSum(arr);
        return sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        Calculation calc = new Calculation();
        int sum = calc.calculateSum(arr1);
        int max = calc.calculateMax(arr1);
        System.out.println("Sum of elements in the array is: " + sum);
        System.out.println("Maximum element in the array is: " + max);
        int min = calc.calculateMin(arr1);
        System.out.println("Minimum element in the array is: " + min);
        int average = calc.calculateAverage(arr1);
        System.out.println("Average of elements in the array is: " + average);
    }
}
