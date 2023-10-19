import java.util.*;

public class Orderofarray {





    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();



        int[] b = new int[n];

        int[] a = new int[n];

        



        for (int i = 0; i < n; i++) {

            System.out.print("Enter the value for array[" + i + "]: ");

            a[i] = sc.nextInt();

        }



        sc.close();

        int j = 0, l = 0;

        while (j < n) {

            if (j == 0) {

                l = n;

            }

            int t = l;

            int min = a[0];

            for (int i = 0; i < t; i++) {

                if (a[i] < min) {

                    min = a[i];

                }

            }

            l = 0;

            for (int k = 0; k < t; k++) {



                if (min == a[k]) {

                    b[j] = a[k];

                    j++;

                } else {

                    a[l] = a[k];

                    l++;

                }



            }

        }



        for (int i = 0; i < n; i++) {

            System.out.print(b[i] + " ");

        }

    }

}

    

