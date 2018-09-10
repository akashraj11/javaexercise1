import java.util.Scanner;
public class Guess {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        // set a random number as target each time
        int target = 1 + (int) (Math.random() * 99);
        int user = 0;
        while (user != target) {
            user = scan.nextInt();
            count++;
            // check if number is greater or less than target
            if (user > target) {
                System.out.println("Number guessed is more than the original number");
            }
            else if (user < target) {
                System.out.println("Number guessed is less than original number");
            }
        }
        System.out.println("You guessed the number with "
                + count + " tries!");
    }
}