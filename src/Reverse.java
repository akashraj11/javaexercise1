import java.util.Scanner;

     public class Reverse {

            public static void main(String args[]) {
                int number;
                Scanner scan=new Scanner(System.in);
                number =scan.nextInt();
                // hashed array to store count of digits
                int count[] = new int[10];

                // Converting given number to string
                String str = Integer.toString(number);

                // Updating the count array
                for(int i=0; i < str.length(); i++)
                    count[str.charAt(i)-'0']++;

                // result is to store the final number
                int result = 0, multiplier = 1;

                // Traversing the count array to calculate the maximum number
                for (int i = 0; i <= 9; i++)
                {
                    while (count[i] > 0)
                    {
                        result = result + (i * multiplier);
                        count[i]--;
                        multiplier = multiplier * 10;
                    }
                }

                System.out.println(result);
            }

    }
