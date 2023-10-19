package stack;

import java.util.*;

public class Seasons {

    public static void main(String[] args) {

     Scanner sc= new Scanner(System.in);

     System.out.println("ENTER MONTH NO:");

     int M= sc.nextInt();

     switch (M) 

     {

         case 12:

         case 1:

         case 2:

             { System.out.println("WINTER");

             break;}

         case 3:

         case 4:

         case 5:

             {System.out.println("SPRING");

             break;}

         case 6:

         case 7:

         case 8:

             {System.out.println("SUMMER");

             break;}

         case 9:

         case 10:

         case 11:

            {System.out.println("AUTUMN");

             break;}

         default:

           {System.out.println("INVALID MONTH NO.");}

             

     } 

    }

    

}
