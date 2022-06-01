package UML_ClassConvertToCodes;

import java.util.Scanner;

public class user {
    public static void main(String[] args) {

        String userName;
        String password;

    Scanner input = new Scanner(System.in);
        System.out.println("Enter userName:  ");
    userName = input.nextLine();

        System.out.println("Enter password:  ");
    password = input.nextLine();

        if (userName.equals("Jey") && (password.equals("Ardy"))) {
        System.out.println("Welcome to Shopping App!");
    }else {
        System.out.println("Wrong userName or password. \n Please try again");
    }
}
    public boolean verifyLogin() {

        return false;

    }
}
