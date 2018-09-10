import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        String input;
        do {
            // take input till input is =
            System.out.println("Enter Number");
            input = scan.next();
            // match input with number and add with sum, use try catch to ignore other characters
            if (input.matches("\\d+")) {
                try {// try block
                    sum += Integer.parseInt(input);
                } catch (Exception ignored) {
                }// catch block
            }
        } while (!input.equals("=")); // when input is '='  exit loop and print sum
        System.out.println(sum);
    }
}
