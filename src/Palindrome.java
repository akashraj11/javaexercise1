import java.util.Scanner;

class Palindrome{
    public static void main(String args[]){
        int r,sum=0;int temp,inputnumber;
        int even =0;
        Scanner s = new Scanner(System.in);
        inputnumber = s.nextInt();
        temp=inputnumber;
        while(inputnumber>0){
            r=inputnumber%10;  //getting remainder
            sum=(sum*10)+r;
            inputnumber=inputnumber/10;
            if(r%2==0)
            {
                even=even+r;//adding even integer
            }
        }
        //condition checking
        if(temp==sum) {
            if(even >25){
                System.out.println("success");
            }
            else
                System.out.println("failure");
        }
        else
            System.out.println("failure");
    }
}  