import java.util.Scanner;



public class Factorial{

    public static void main(String[] args) {



        // Factorial: Write a program to calculate the factorial of a given number using a loop (e.g., 5! = 5 x 4 x 3 x 2 x 1).

        

        Scanner sc = new Scanner(System.in);

        System.out.println(" please enter any number ");



         int a = sc.nextInt();

         int fact=1;



         for( int i=1;i<=a;i++)

         {

            fact=fact*i;



 

         }

                    System.out.println(+fact);











        sc.close();



    }



}
