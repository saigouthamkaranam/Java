import java.util.Scanner;

class Convertor{

    
    public void weightConvertor(double x, boolean y)
    {
        if (y)
        {
            x = x * 2.2;
            System.out.println("Your weight in Pounds is " +x + "lbs" );
        }
        else {
            x = x * 0.45;
            System.out.println("Your weight in Kilo Grams is " +x + "Kgs" );

        }

    }

}

public class main {
    
    public static void main (String args[])

    {
        Scanner sc = new Scanner(System.in);
        Convertor c = new Convertor();
        int choice; 
        boolean inKGs = true;
        double weight = 0;
        System.out.println("Please Select your weight options\n1.in Kgs \n2.in Pounds\n");
        choice = sc.nextInt();
        

        if (choice == 1)
        {
            System.out.print("Enter your weight in Kilo Grams:  ");
            weight = sc.nextDouble();
            c.weightConvertor(weight,inKGs);

        }
        else if (choice == 2)
        {
            System.out.print("Enter your weight in Pounds:  ");
            weight = sc.nextDouble();
            inKGs = false;
            c.weightConvertor(weight,inKGs);
        }
        else
        {
            System.out.println("Enter valid option");
        }

        sc.close();
        
    }  

}
