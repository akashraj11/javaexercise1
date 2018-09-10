import java.util.Scanner;

public class revString {
    public static void main(String[]args)
    {
        String str="";
        String rev="";
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        // reverse string by appending to rev the last character
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
    }
}
