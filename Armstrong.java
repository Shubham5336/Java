import java.util.*;

public class Armstrong {

    public static void main(String[]args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("enter number");

        int n=sc.nextInt();

        int m=n;

        int a,c=0,arm=0;

        while (m>0) {

            m=m/10;

            c++;

        }

        m=n;

        while (m>0)

         {

            a=m%10;

            m=m/10;

            arm=arm+(int)Math.pow(a,c);

        }

        System.out.println(arm);

        if(arm==n)

        {

            System.out.println("yes");

        }

        }

    }
