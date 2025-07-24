import java.util.*;

public class kadane_Algo
{
    public static void main(String[] arg)
    {
        int[] arr={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max_sum=kadane_Algo(arr);
        System.out.println("Maximum sub array: "+max_sum);
    }
    public static int kadane_Algo(int[] arr)
    {
        int max=arr[0];
        int current=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            current=Math.max(arr[i],current+arr[i]);
            max=Math.max(max,current);
        }
        return max;
    }
}