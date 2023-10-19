import java.util.*;

public class Prime {

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter number");

        int n=sc.nextInt();

        int i,p=0,f=0;

            for (i = 2; i<=n; i++) {

                f=0;

                for (int j = 2; j <i; j++) {

                    if (i%j==0) {

                        f=1;

                        break;

                    }

                }

                if(f==0&&n%i==0)

                {

                        p=i;

                    }

            }

            if(n==1)

            System.out.println(n);

            else

            System.out.println(p);

            prim(n);

        }

        public static void prim(int n) {

            int a=2,m=n;

            while(a<n){

                if(n%a==0)

            {

                n=n/a;

            } 

        else{

            a++;

        }

    }

    if(n==1)

    System.out.println(m);

    else

    System.out.println(a);

        }

      

 }    
