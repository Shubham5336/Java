import java.util.Scanner;

public class BMI {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your height");

        float height=sc.nextFloat();

        double mh=height*0.304;

        System.out.println("your hieght in meter is ->"+mh);

        System.out.println("Enter your weight");

        float weight=sc.nextFloat();

        double BMI=weight/(mh*mh);

        System.out.println("your bmi is ->"+BMI);

        sc.close();

    }     

}

    
