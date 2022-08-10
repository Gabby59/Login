import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            System.out.println("This is a login script.");

            Scanner input = new Scanner(System.in);
            String username = "Admin";
            String password = "Password!";

            //declare an integer variable to store the number of user attempts
            int attempt = 0 ;

            //as long as there have been less than 3 attempts
            while (attempt < 3) {

                //display user instructions
                System.out.print("Please insert your username:");
                //input user name
                String usernameInput = input.nextLine();
                //check whether the username value is empty and if so, loop until the user inserts a value
                while (usernameInput == "") {
                    System.out.print("No input detected. Please insert your username:");
                    usernameInput = input.nextLine();
                }
                //prompt the user to insert a password
                System.out.print("Please insert your password:");
                String passwordInput = input.nextLine();

                //if both username and password match, then the user can log in
                //ignore case differences for username input
                if (usernameInput.equalsIgnoreCase(username) && passwordInput.equals(password)) {
                    System.out.println("You have been validated!");
                }

                //if not, the user is informed that he cannot log in
                else {
                    System.out.println("Access not authorised!");
                    //store and increase the number of user attempts
                    attempt++;
                }
            }

            //when the user enters wrong information 3 times
            System.out.println("You are banned!");
        }

}
