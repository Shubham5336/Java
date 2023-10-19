import java.util.*;



public class Hollowsquare {

public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);

    System.out.println("enter numeber n");

    int n=sc.nextInt();

    double m=Math.pow(n, 2);

    for(int i=1;i<=n;i++)

    {

        for(int j=1;j<=n;j++)

        {

            if(i==1||i==n||j==n||j==1)

            {

                System.out.print("* ");

            }

            else{

                System.out.print("  ");

            }

        }System.out.println();

    }

    System.out.println(m);

}

}
