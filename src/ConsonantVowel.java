import java.util.Scanner;
    public class  ConsonantVowel {
        public static void main(String[ ] arg) {
            String ch;
            Scanner scan = new Scanner(System.in);
            ch = scan.nextLine();
            // Condition checking for consonant or vowel
            for (int j=0;j<ch.length();j++)
            {
                char letters = ch.charAt(j);
                if(letters=='A' || letters == 'E' || letters=='I' || letters=='O' || letters=='U' || letters=='a' || letters=='e' || letters=='i' || letters=='o' || letters=='u')
                    System.out.println("Vowel");
                else if((letters>='a' && letters<='z') || (letters>='A' && letters<='Z'))
                    System.out.println("consonant");
                else
                    System.out.println("error");
            }


        }

}
