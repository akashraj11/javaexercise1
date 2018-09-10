import java.util.Scanner;

class Palindrome{
    public static void main(String args[]){
        int r,sum=0,temp,n;
        int even =0;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
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