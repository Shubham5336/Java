import java.util.*;

public class Diamond pattern {

public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);

    System.out.println("enter n");

    int n=sc.nextInt();

    for(int i=1;i<=n;i++){

        for (int j = 1; j <=n-i; j++) {

          System.out.print(" ");  

        }

        for (int k= 1; k <= i; k++) {

            System.out.print("* ");          

        }

        System.out.println();

    }

    for (int i = 1; i <= n; i++){

        for (int k= 1; k <=i; k++) {

            System.out.print(" ");

        }

        for (int j = 1; j <=n-i ; j++) {

            System.out.print("* ");

        }

        System.out.println();

    }

}    

}
