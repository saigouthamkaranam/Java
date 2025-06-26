// Class:
// Class is the instance of an object
import java.util.Scanner;
//1. Declare a Calculator Class

class Calculator {
    double n1;
    double n2;

    //Addition Method
    public double Add (double n1 , double n2)

    {
        return n1 + n2;
    }

    //Subtract Method
    public double Substract (double n1 , double n2)

    {
        return n1 - n2;
    }

    //Multiply Method
    public double multiply (double n1 , double n2)

    {
        return n1 * n2;
    }
    
    //Division Method
    public double division (double n1 , double n2)

    {
        return n1 / n2;
    }
}

public class main
{

    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);

        // Declaring Num1 
        System.out.println("Enter Number 1:");
        double num1 = sc.nextDouble();

        //Declaring Num2
        System.out.println("Enter Number 2:");
        double num2 = sc.nextDouble();

        //Declaring Operarion
        System.out.println("Enter operation that you want to perform:/n1. ADD/n2. SUBSTRACT/n3. DIVISION/n4. MULIPLICATION");
        int operation = sc.nextInt();

        Calculator cal = new Calculator();

        double Addition = cal.Add(num1, num2);
        double Substraction = cal.Substract(num1, num2);
        double Multiply = cal.multiply(num1, num2);
        double Division = cal.division(num1, num2);

        switch (operation) {
            case 1:
                System.out.println("The addition of two numbers is: ");
                System.out.println(Addition);
                break;
            case 2:
                System.out.println("The Substraction of two numbers is: ");
                System.out.println(Substraction);
                break;
            case 3:
                System.out.println("The Multiplication of two numbers is: ");
                System.out.println(Multiply);
                break;
            case 4:
                System.out.println("The Division of two numbers is: ");
                System.out.println(Division);
                break;
            default:
                System.out.println("Please enter valid Operation number");
                break;
        }

        sc.close();

    }

}




/* 
 1. Declare a Calculator Class
 2. Define Operations in the form of methods
 3. Main method
 4. Call the method.
*/