import java.util.*;

public class AreaOfRectangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length : ");

        int l = sc.nextInt();

        System.out.print("Enter the breadth : ");

        int b = sc.nextInt();

        int Area = l*b;

        System.out.println("Area is : "+Area);

        sc.close();

    }

}
