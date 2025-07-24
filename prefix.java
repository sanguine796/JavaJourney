import java.util.*;

public class prefix
{
    public static void main(String[] arg)
    {
        Scanner scn=new Scanner(System.in);
        int[] arr={1,3,4,5,7,8};
        int sum,left=0;
        int right=arr.length-1;
        boolean found=false;
        System.out.println("Enter Target:");
        int target=scn.nextInt();

        while(left<right)
        {
            sum=arr[left]+arr[right];
            if(sum==target)
            {
                found=true;
                System.out.print("\nTarget found when : "+arr[left]+" and "+arr[right]+"\n");
                break;
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        if(!found) System.out.println("No pair found with sum " + target);
    }
}