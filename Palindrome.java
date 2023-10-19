import java .util.*;

public class palindrome {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter number");

        int x=sc.nextInt();

        int n=x,a=0;

        while(n>0){

            a=(a*10)+(n%10);

            n=n/10;

        }

        if (a==x) {

            System.out.println("palindrome");

            }

        else

        System.out.println("not a palindrome");

    }

    

}
