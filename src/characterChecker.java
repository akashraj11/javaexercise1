import java.util.Scanner;

public class characterChecker {
    public static void main(String[] args) {
        char c;
        Scanner scan = new Scanner(System.in);
        c=scan.next().charAt(0);
        // Scharacter condition checking
        if (c>=65 && c<=90)
            System.out.println("Character is a capital letter");
        else if (c>=97 && c<=122)
            System.out.println("Character is a small letter");
        else if (c>=48 && c<=57)
            System.out.println("Character is a digit");
        else if ((c>0 && c<=47)||(c>=58 && c<=64)||
                (c>=91 && c<=96)||(c>=123 && c<=127))
            System.out.println("Character is a special symbol");
    }
}
