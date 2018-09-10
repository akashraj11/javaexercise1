
    import java.util.Scanner;
    public class TomJerry {
        public static void main(String args[]){
            int number;
            Scanner s = new Scanner(System.in);
            number = s.nextInt();
            // Condition checking
            if(number%2 ==0 && (number>=20 && number <=30)){
                System.out.println("Jerry");
            }
            else if(number%2 !=0 && (number>=20 && number <=30)){
                System.out.println("Tom");
            }
            else
                System.out.println("Neither tom nor Jerry");
        }
    }
