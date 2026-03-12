package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 18;
        fibonacciSequence(n);
        fibonacciSequenceAlter(n);
    }

    public static void fibonacciSequence(int n) {
        int result = 0;
        int[] arr = new int[n + 1];
        for (int i = 0; i < n + 1; i++)
        {
            if (i == 0) {
                arr[i] = result;
            }
            else if (i == 1) {
                result = 1;
                arr[i] = result;
            }
            else {
                result = arr[i - 1] + arr[i - 2];
                arr[i] = result;
            }
        }
        System.out.println(result);
    }

    //    Other method
    public static void fibonacciSequenceAlter(int n) {
        int firstNumber = 0;
        int secondNumber = 1;
        int nextNumber = 0;
        for (int i = 1; i < n; i++)
        {
            nextNumber = firstNumber+secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            System.out.println(nextNumber);
        }
    }
}
