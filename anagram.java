import java.util.*;
public class anagram
{
    public static void main(String[] arg)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1=scan.nextLine();
        System.out.println("Enter the second string: ");
        String s2=scan.nextLine();
        
        if(s1.length() != s2.length()){
            System.out.println("Length is not matched");
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2))
        {
            System.out.println("This is Anagram");
        }else{
            System.out.println("This is not Anagram");
        }
    }
}