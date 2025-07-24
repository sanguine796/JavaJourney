import java.util.*;

public class string_Palindrome
{
    public static void main(String[] arg)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a word:");
        String word=scn.nextLine();
        boolean match=true;

        int left=0;
        int right=word.length()-1;
        while(left<right)
        {
            if(word.charAt(left)!=word.charAt(right))
            {
                match=false;
                break;
            }
            left++;
            right--;
        }
        if(match)
        {
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is not palindrome");
        }

    }
}
