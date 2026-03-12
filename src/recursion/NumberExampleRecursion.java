package recursion;

public class NumberExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }

    public static void print(int n)
    {
        //        Base condition
        if(n>5)
        {
            return;
        }


        System.out.println(n);
        //        recursive call
//        This is called TAIL RECURSION as result is not depending on any other call
        print(n+1);
    }

}
