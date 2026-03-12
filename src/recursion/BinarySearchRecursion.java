package recursion;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        int start = 0;
        int end = arr.length - 1;
        int num = 45;
        int result = binary(arr, start, end, num);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }

    public static int binary(int[] arr,int start,int end,int num)
    {
        if(start>end)
        {
            return -1;
        }
        int mid = (start+end)/2;
        if(num == arr[mid])
        {
            return mid;
        }
        else if(num<arr[mid])
        {
            return binary(arr, start,mid-1,num);
        }
        else
        {
            return binary(arr, mid+1,end,num);
        }
    }
}
