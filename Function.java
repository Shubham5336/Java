

import java.util.*;

public class fuction {

        public static void main(String[] args) {



        int i=0;

        while( i==0)

        {

            Scanner sc = new Scanner(System.in);

            System.out.println("ENTER 'S'fOR SUM OF NATRAL NO. TILL IT");

            System.out.println("ENTER 'F'fOR FACTORIAL");

            System.out.println("ENTER 'FI'fOR FIBONACCI SERIES");

            System.out.println("ENTER 'E'fOR EXP");

            System.out.println("ENTER 'H'fOR HANOI");

            System.out.println("ENTER 'R' FOR REVERSE OF A STRING");

            String sr = sc.nextLine();

            System.out.println("ENTER THE NUMBERS");

            System.out.println("ENTER THE NUMBERS");

            int n = sc.nextInt();

            if(sr.compareToIgnoreCase("S")==0){

                int s =0;

                function(n,s) ;

            }

            else if(sr.compareToIgnoreCase("f")==0){

                int f=1;

                factorial(n ,f);

            }

            else if(sr.compareToIgnoreCase("fi")==0){

                System.out.println("FIBONACCI SERIES IS - ");

                if(n==1){

                    System.out.print("0");

                }

                else if(n==2){

                    System.out.print("0 , 1 ");

                }

                else if(n>2){

                    System.out.print("0 , 1 ");

                    fibonacci(n-2, 0, 1, 0);

                }

                else{

                    System.out.println("WRONG INPUT");

                }

            }

            else if(sr.compareToIgnoreCase("e")==0){

                System.out.println("ENTER THE POWER OF "+n+" ");

                int x = sc.nextInt();

                System.out.print(n+" TO THE POWER OF "+x+"IS");

                exp(x, n, 1);

                int r =exp(n, x, 1);

                System.out.println(" "+r);

            }

            else if(sr.compareToIgnoreCase("h")==0){

                hanoi(n);

                System.out.println("NUMBER OF SHIFT ARE ="+hanoi(n));

                hanoi1(n, "S", "H", "D");

            }

            else if(sr.compareToIgnoreCase("r")==0) {

                String re = sc.nextLine();

                int c = re.length();

                revers(re, c);

            }

            else

            {

                break;

            }



        }

    }

    public static void function(int n,int s) {

        if(n<0){

            System.out.println("THE SUM OF NATURAL NUMBER IS "+s);

            return ;

        }

        s=s+n;

        n--;

        function(n,s);

    }

    public static void factorial(int n,int f) {

        if(n>0){

            f=f*n;

            n--;

            factorial(n,f);

        }

        else{

            System.out.println("FACTORIAL OF THE NUMBER IS "+f);

            return;

        }

    }

    public static void fibonacci(int n,int a,int b,int c ) {

        if(n>0){

            c=a+b;

            a=b;

            b=c;

            System.out.print(", "+c+" ");

            fibonacci(n-1, a, b, c);

        }

        else{



        }

    }

    public static int exp(int x,int n ,int p){

        if(n==0){

            return 1;

        }

        System.out.print(p);

        if(x==0){

            return 0;

        }

        if(n%2==0){

            return exp(x, n/2, p)*exp(x, n/2, p);

        }

        else{

            return exp(x, n/2, p)*exp(x, n/2, p)*x;

        }

    }

    public static int hanoi(int n) {

        if (n==0){

            return 0;

        }

        if(n==1){

            return 1;

        }

        return (2*hanoi(n-1))+1;

    }

    public static void hanoi1(int n ,String s,String h,String d ) {

        if(n==1){

            System.out.println("transfer disk "+n+ " from "+s+" to "+d);

            return;

        }

        hanoi1(n-1, s, d, h);

        System.out.println("transfer disk "+n+" from "+s+" to "+d);

        hanoi1(n-1, h, s, d);

    }

    public static void revers(String re ,int c ){

        if(c<0){

            return;

        }

        System.out.print(re.charAt(c));

        revers(re,c-1);

    }

}



