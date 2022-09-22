import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("---------------------------------------------");
        System.out.println("Welcome to the Murtech Reimbursement System");
        System.out.println("---------------------------------------------");

        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");

        String userInput;
        do {
            Scanner scnrObj = new Scanner(System.in);
            userInput = scnrObj.nextLine();

            if (userInput.equals("1")) {
                loginFunction();
            } else if (userInput.equals("2")) {
                registerFunction();
            } else if (userInput.equals("3")) {
                System.out.println("Thank you, have a nice day!");
            } else {
                System.out.println("Please enter a valid option.");
            }
        } while (!userInput.equals("3"));
    }
    public static void loginFunction(){

    }

    public static void registerFunction(){

    }

}