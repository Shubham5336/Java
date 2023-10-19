package stack;

import java.util.*;

public class Traffic {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("ENTER LIGHT COLOR:");

    String str= sc.nextLine();

   

    switch(str){

        case "red":

        case "green":

        {

            System.out.println("NEXT LIGHT WILL BE YELLOW");

            break;

        }

        case "yellow":

        {

            System.out.println("NEXT LIGHT CAN BE RED OR GREEN");

            break;

        }

        default:

        { System.out.println("INVALID COLOR");}

    }



        

    }

    

}
