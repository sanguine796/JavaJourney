public class diagnol_sum
{
    public static void main(String arg[])
    {
        int[][] arr1={{1,3,5},{6,7,8},{6,0,3}};
        int n = arr1.length;  
        int primary=0;
        int secondary=0;      

        for(int i=0;i<n;i++)
        {
            primary+=arr1[i][i];
            secondary+=arr1[i][n-i-1];
        }


        System.out.println("Primary Diagonal Sum: " + primary);   
        System.out.println("Secondary Diagonal Sum: " + secondary);
    }
}