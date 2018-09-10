import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int inputnumber;
        Scanner scan=new Scanner(System.in);
        inputnumber=scan.nextInt();
        // printing pattern till inputnumber
        for (int i=1;i<=inputnumber;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
        }
    }
}
