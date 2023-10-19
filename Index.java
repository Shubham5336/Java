import java.util.Scanner;



public class index{

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int number=sc.nextInt();



        for(int i=1;i<=10;i++){

            System.out.println(number + "x" + i + "=" +i*number);

        }

        String namearr[]={"ram","shyam"};

        for(int i=0;i<namearr.length;i++){

            System.out.println(namearr[i]);

        }

        int j=0,k=0;

        while(j<4){

            System.out.println("hello" +j);

            j=j+1;

        }

        do{

            System.out.println("hellodo" +k);

            k++;

        }while(k<7);

    }

}
