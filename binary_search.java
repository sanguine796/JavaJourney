import java.util.Scanner;
public class binary_search
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
        System.out.println("Enter element to search of an array");
        int key=scan.nextInt();
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

        boolean count=false;
        if(arr[mid]==key)
        {
            System.out.printf("element found at index is %d",mid);
            count=true;
            break;
        }else if(arr[mid]<key){
            low=mid+1;
        }else{
            high=mid-1;
        }
        
        if(!count){
            System.out.println("Element not found in the array.");
        }
        }
    }
}