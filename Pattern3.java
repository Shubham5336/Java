import java .util.*;

public class Pattern3 {

    public static void main(String[] args) {

        System.out.println("enter n");

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int j;

        for (int i = 1; i <=n; i++) {

             for (j = 1; j <=i; j++) {

                 if(j==1||i==n||i==j){

                System.out.print("* ");   

            }

        else{

            System.out.print("  ");

        }}

            System.out.println();

    }

}

}
