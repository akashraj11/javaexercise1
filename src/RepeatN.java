import java.util.Scanner;

public class RepeatN {
    public static void main(String[] args) {
        String str = "";
        int inputnumber;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        inputnumber = sc.nextInt();
        int length = str.length();
        for (int i = 0; i < length - inputnumber; i++) {
            System.out.print(str.charAt(i));
        }
        int j = 0;
        // print last n character n times
        while (j < inputnumber)
        {
            for(int k=length-inputnumber;k<length;k++)
            {
                System.out.print(str.charAt(k));
            }
            j++;
        }
    }
}
