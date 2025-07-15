import java.util.Scanner;
public class large
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
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.printf("Largest element in an array is %d",max);
    }
}