import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int n;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        // printing pattern till n
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
        }
    }
}
