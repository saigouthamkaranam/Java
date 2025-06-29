import java.util.Scanner;

/*
1. Declare the variables.
2. Take user input => email.
3. Condition for checking email:
    | - If email contains '@' or not 
        | print Hello + username
    | - Please enter valid email
4. username = use string methods and substring
5. domain = use string methods and substring
 */


public class main {

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String email;
        String domain;
        String username;

        System.out.println("Enter your email:");
        email = sc.nextLine();

        if( email.contains("@"))
        {
            int length = email.length();
            username = email.substring(0, email.indexOf("@"));
            username = username.toUpperCase();
            domain = email.substring(email.indexOf("@") + 1,length);
            System.out.printf("Hello %s!!\n",username);
            System.out.printf("Your Domain is %s\n",domain);
        }
        else 
        {
            System.out.printf("Please enter valid email such as ending with gmail.com\n");
        }


        sc.close();
    }
    
}
