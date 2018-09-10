import java.util.Scanner;

public class CharacterChecker {
    public static void main(String[] args) {
        char inputchar;
        Scanner scan = new Scanner(System.in);
        inputchar=scan.next().charAt(0);
        // Scharacter condition checking
        if (inputchar>=65 && inputchar<=90)
            System.out.println("Character is a capital letter");
        else if (inputchar>=97 && inputchar<=122)
            System.out.println("Character is a small letter");
        else if (inputchar>=48 && inputchar<=57)
            System.out.println("Character is a digit");
        else if ((inputchar>0 && inputchar<=47)||(inputchar>=58 && inputchar<=64)||
                (inputchar>=91 && inputchar<=96)||(inputchar>=123 && inputchar<=127))
            System.out.println("Character is a special symbol");
    }
}
