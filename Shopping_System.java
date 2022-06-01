package UML_ClassConvertToCodes;

import java.util.Scanner;

public class Shopping_System {

    private static String customersName;
    private static int age;
    private static String address;
    private static String email;
    private static String userName;
    private static String password;
    private static String searchItem;
    public static Scanner input = new Scanner(System.in);
    public static int choose, quantity;
    public static double total;
    public static double subtotal;
    public static String pay;


    public static void Customer () {

        System.out.println("Enter name: ");
        customersName = input.nextLine();
        System.out.println("Enter age: ");
        age = Integer.parseInt(input.nextLine());
        System.out.println("Enter address: ");
        address = input.nextLine();
        System.out.println("Enter email: ");
        email = input.nextLine();
        System.out.println("Enter userName:  ");
        userName = input.nextLine();
        System.out.println("Enter password:  ");
        password = input.nextLine();
        if (userName.equals("Jey") && (password.equals("Ardy"))) {
            System.out.println("Welcome to Shopping App!");
        } else {
            System.out.println("Wrong userName or password. \n Please try again");
            System.exit(0);
        }

    }

    public boolean userAuthenticated;

    public boolean verifyLogin () {
        if (userAuthenticated == true)
            return true;
        else
            return false;
    }

    public static void ShoppingApp () {
        System.out.println("******************Categories********************");
        System.out.println("Shorts");
        System.out.println("Pants");
        System.out.println("Dress");
        System.out.println("Shirts");
        System.out.println("Shoes and Sandals");
        System.out.println("************************************************");

        System.out.println("Search Items: ");
        searchItem = input.next();
        if (searchItem.equals("Shorts")) {
            System.out.println(" 1. Taslan Shorts - ₱120");
            System.out.println("2. Denim Shorts - ₱150");
            System.out.println("3. Cargo Shorts - ₱160");

        } else if (searchItem.equals("Pants")) {
            System.out.println(" 1. Ripped Jeans - ₱150");
            System.out.println("2. Baggy Jeans - ₱180");
            System.out.println("3. Denim Pants - ₱220");
            System.out.println("4. Cargo Pants - ₱120");

        } else if (searchItem.equals("Dress")) {
            System.out.println(" 1. Fitted Dress - ₱100 ");
            System.out.println(" 2. Cocktail Dress - ₱200");
            System.out.println(" 3. Infinity Dress - ₱270");

        } else if (searchItem.equals("Shirts")) {
            System.out.println(" 1. Polo Shirts - ₱120");
            System.out.println(" 2. Oversize Shirts - ₱180");
            System.out.println(" 3. Half sleeve T-Shirts - ₱110");
            System.out.println(" 4. Round Neck T-shirts - ₱150");
            System.out.println(" 5. V-neck Shirts - ₱180");


        } else if (searchItem.equals("Shoes And Sandals")) {
            System.out.println(" 1. Men's Shoes - ₱325");
            System.out.println(" 2. Women's Shoes - ₱300");
            System.out.println(" 3. Men's Sandals - ₱180");
            System.out.println(" 4. Women's Sandals - ₱200");

        }
    }
    public static void Order() {
        System.out.println("Enter your choice: ");
        choose = input.nextInt();

        System.out.println("Enter your price: ");
        int price = input.nextInt();

        System.out.print("Enter quantity: ");
        quantity = input.nextInt();


            subtotal = price * quantity;

            System.out.println("Subtotal price is " + subtotal);

            float shippingFee = 58;

            System.out.println("Subtotal price is " + subtotal);

            if (subtotal > 300) {
                total = subtotal - (subtotal * 0.20);
                System.out.println("\titem is eligible for a 20% discount");
            } else if (subtotal < 200 && subtotal >= 500) {
                total = subtotal - (subtotal - 0.10);
                System.out.println("\t item is eligible for a 10% discount");
            } else {
                total = subtotal + (58);
                System.out.println("\t Item is not eligible for any discount");
            }
            System.out.println("\tYour total amount is:" + total);
            System.out.println();
            System.out.println("---------------------PaymentOption----------------");
            System.out.println(" CashOnDelivery");
            System.out.println(" Credit/DebitCard");
            System.out.println(" eWallet");
            System.out.println(" OnlinePayment");
            System.out.println("--------------------------------------------------");
            System.out.println("Payment Option: ");
            pay = input.next();
            System.out.println("Php " + total + " will be payed upon " + pay);
            System.out.println("\t THANK YOU!");

        }


    public static void main(String[] args) {

        Customer();
        ShoppingApp();
        Order();
    }
}

