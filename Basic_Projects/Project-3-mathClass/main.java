import java.util.Scanner;

public class main {
    
    public static void main (String args[]){

        // Finding the hypotenuese
        Scanner sc = new Scanner(System.in);
        double a,b,c;

        System.out.print("Enter First Number: ");
        a = sc.nextDouble();

        System.out.print("Enter First Number: ");
        b = sc.nextDouble();
        c = Math.sqrt(a*a + b*b);

        System.out.println("The Hypotenuese of Given numbers is " + c);

        sc.close();
    
    }
}
