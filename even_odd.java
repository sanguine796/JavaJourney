import java.util.Scanner;
public class even_odd
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
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                even++;
            }else{
                odd++;
            }
        }
        System.out.printf("The odd and even numbers in an array is %d and %d",odd,even);
    }
}