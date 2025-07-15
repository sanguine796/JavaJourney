import java.util.Scanner;
public class avg
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
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        float avg=sum/n;
        System.out.printf("The sum and average of an array is %d and %f",sum,avg);
    }
}