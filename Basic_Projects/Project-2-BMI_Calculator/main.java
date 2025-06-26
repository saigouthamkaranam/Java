
import  java.util.Scanner;

class BMI {

    float bmi = 0;
    public float bmiConvertor (float w, float h) 
    {
        bmi = w/(h * h);
        System.out.println("Your BMI is" +" " + bmi);
        
        if (bmi > 30)
        {
            System.out.println("You are Obese");
        }
        else if ((bmi > 25) && (bmi < 30 ))
        {
            System.out.println("You are OVERWEIGHT");

        }
        else if ((bmi > 18.5) && (bmi <= 25 ))
        {
            System.out.println("Congratualtions you are healthy!!!");

        }
        else 
        {
            System.out.println("You are UNDERWEIGHT!!");
        }
        return bmi;
    }

}

public class main {
    
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    BMI bmi = new BMI();

    System.out.println("Enter your Height in cm");
    float height = sc.nextFloat();
    height = height /100;

    System.out.println("Enter your Weight in Kgs");
    float weight = sc.nextFloat();

    bmi.bmiConvertor(weight, height);

    sc.close();

}
}

/*
1. Get Height in cm and weight in kg from user.
2. Convert heights from cm to meters
3. Define BMI finder method.
4. Then do the cases to return the BMI value and saying if you are helathy under or obese
 */

