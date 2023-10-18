import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        float r = sc.nextFloat();
        float area = 3.14F*r*r;
        System.out.print("Area is : "+area);
        sc.close();
    }
}
