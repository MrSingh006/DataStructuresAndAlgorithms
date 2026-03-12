package recursion;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {0,5,10,15,20,25,30,35,40,45,50};
        int start = 0;
        int end = arr.length-1;
        int num = 51;
        int result = binary(arr,start,end,num);
        if (result == -1)
        {
            System.out.println("Element not present");
        }
        else
        {
            System.out.println("Element found at index " + result);
        }

        int ans = binaryWithFor(arr,start,end,num);
        if (ans == -1)
        {
            System.out.println("Element not present FOR");
        }
        else
        {
            System.out.println("Element found at index FOR" + ans);
        }
    }

    public static int binary(int[] arr,int start,int end,int num)
    {
        int count =0;
        while(start<=end)
        {
            int mid = (start+end)/2;
            System.out.println("mid id : "+mid);

            if(num == arr[mid])
            {
                return mid;
            }
            else if(num > arr[mid])
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
            System.out.println("value of count"+count++);
        }
        return -1;
    }

//    With for loop
/*For loops tend to be used when we're saying, "For each item in this group," or
"Do it a particular number of times." While loops tend to be used when the end condition
is less predictable, or is external, such as "keep going as long as there are more lines to read,
" or "...until the user enters 'N'".*/

    public static int binaryWithFor(int[] arr,int start,int end,int num)
    {
        for(int i =0;i<arr.length-1;i++)
        {
            int mid = (start+end)/2;
            System.out.println("mid id FOR : "+mid);

            if(num == arr[mid])
            {
                return mid;
            }
            else if(num > arr[mid])
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
            System.out.println("value of i : "+i);
        }
        return -1;
    }

}
