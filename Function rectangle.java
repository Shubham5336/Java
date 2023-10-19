import java.util.Scanner;



public class Function rectangle {

    public static void rect(int length, int width){

       int area=length*width;

        System.out.println("area of rectangle is : "+area);

       int a=length+width;

       int perimeter=2*a;

       System.out.println("perimeter of rectangle is : "+perimeter);

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter length");

        int length=sc.nextInt();

        System.out.println("enter width : ");

        int width=sc.nextInt();

        rect(length,width);

    }

}
