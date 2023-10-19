import java.util.*;

public class Anagram {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String s1,s2;

        System.out.println("enter string s1 and s2");

        s1=sc.nextLine();

        s2=sc.nextLine();

        int n=s1.length(),m=s2.length(),i=0,j=0,h=0;

        if (n==m) {

            while(i<n&&j<m){

                if(s1.charAt(i)==s2.charAt(j)){

                    i++;h++;

                    j=0;

                }

                else{

                    j++;

                }

            }

            if(h==m){

                System.out.println("Anagram");

            }

            else

            System.out.println("not anagram");

        }

        else

        System.out.println("not an anagram string");

    }

    

}
