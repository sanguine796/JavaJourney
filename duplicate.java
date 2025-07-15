import java.util.*;
public class duplicate
{
    public static void main(String arg[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=scan.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements in an array");
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        
        Set<Integer> set=new LinkedHashSet<>();
        for(int num:arr)
        {
            set.add(num);
        }

        System.out.println("Remove Duplicates");
        for(int num:set)
        {
            System.out.printf("%d ",num);
        }
    }
}