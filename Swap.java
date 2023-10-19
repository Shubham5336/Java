import java.util.*;

public class Swap {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter number");

        int a=sc.nextInt(),b=sc.nextInt();

       a=a+b;

       b=a-b;

       a=a-b;

       System.out.println("swap values of a&b are"+a+b);

    }

}
