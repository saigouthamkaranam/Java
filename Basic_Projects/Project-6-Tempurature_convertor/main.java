import java.util.Scanner;

public class main {

    public static void main (String args[]){

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;
    
        System.out.print("Enter the tempurature: ");
        temp = scanner.nextDouble();
        scanner.nextLine();
     

        System.out.print("Convert the tempurature to Celcius or Farenhiet? (please enter C or F): ");
        unit = scanner.nextLine();

        if (unit.equalsIgnoreCase("C"))
        {
            
            newTemp = (temp - 32)* 5 / 9;
            System.out.println("The temperature in Farenhiet is: " + newTemp+ "C");
        }
        else if (unit.equalsIgnoreCase("F")) 
        {
            newTemp = (temp * 9 / 5) + 32;;
            System.out.println("The temperature in Farenhiet is: " + newTemp+ "F");
            
            
        }
        else {
            System.out.println("Please enter valid options i.e either C or F");
        }
        
        scanner.close();
        

    }
}