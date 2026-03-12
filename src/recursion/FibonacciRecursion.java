package recursion;

public class FibonacciRecursion {
    public static void main(String[] args) {
        int ans = fibo(10);
        System.out.println(ans);
    }

    public static int fibo(int n)
    {
        // base condition : As we know fibo(0) = 0 and fibo(1) = 1
        if(n<2)
        {
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
