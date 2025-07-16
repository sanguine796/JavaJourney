public class transpose_matrix
{
    public static void main(String arg[])
    {
        int[][] arr1={{1,3,5},{6,7,8}};
       int n = arr1.length;        
        int m = arr1[0].length;
        int[][] result = new int[m][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[j][i] = arr1[i][j];
            }
        }


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}



 