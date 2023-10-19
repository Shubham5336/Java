import java.util.*;

public class factor {

    public static void main(String[]args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter number");

        int n=sc.nextInt();

        int d=2;

        while(n!=0){

            if(n%d!=0){

                d++;

            }

            else{

                n=n/d;

            }

            if(n==d)

            {



            }

        }

    } 

}
