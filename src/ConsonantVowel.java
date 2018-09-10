import java.util.Scanner;
    public class  ConsonantVowel {
        public static void main(String[ ] arg) {
            String inputchar;
            Scanner scan = new Scanner(System.in);
            inputchar = scan.nextLine();
            // Condition checking for consonant or vowel
            for (int j=0;j<inputchar.length();j++)
            {
                char letters = inputchar.charAt(j);
                if(letters=='A' || letters == 'E' || letters=='I' || letters=='O' || letters=='U' || letters=='a' || letters=='e' || letters=='i' || letters=='o' || letters=='u')
                    System.out.println("Vowel");
                else if((letters>='a' && letters<='z') || (letters>='A' && letters<='Z'))
                    System.out.println("consonant");
                else
                    System.out.println("error");
            }


        }

}
