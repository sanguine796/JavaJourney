import java.util.Scanner;
public class matrix_add
{
    public static void main(String arg[])
    {
        Scanner scan=new Scanner(System.in);
        int[][] arr1={{1,3,5},{6,7,8}};
        int[][] arr2={{2,4,6},{7,9,0}};
        int n=arr1.length;
        int m=arr1[0].length;
        int[][] result=new int[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                result[i][j]=arr1[i][j]+arr2[i][j];
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(result[i][j] +" ");
            }
            System.out.println();
        }

    }
}