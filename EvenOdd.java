import java.util.*;

public class even {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter number");

        int a=sc.nextInt(),b=sc.nextInt();

       String res= a%2==0 ? "a is even":"a is odd";

       System.out.println(res);

    }

}
