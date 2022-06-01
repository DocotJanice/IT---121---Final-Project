package UML_ClassConvertToCodes;

import java.util.Scanner;

public class ShoppingApp {

    // attributes
    private String searchItems;

    //Methods
    public ShoppingApp(String searchItems){
        this.searchItems = searchItems;

        Scanner input = new Scanner(System.in);
        double displayCategories;

        System.out.println("******************Categories********************");
        System.out.println("Shorts");
        System.out.println("Pants");
        System.out.println("Dress");
        System.out.println("Shirts");
        System.out.println("Mobile and Gadgets");
        System.out.println("************************************************");


        System.out.println("Search Items: ");
        searchItems = input.nextLine();
        if (searchItems.equals("Shorts")) {
            System.out.println(" 1. Taslan Shorts - 120 \n 2. Denim Shorts - 150 \n 3. Cargo Shorts - 160");
        }else if (searchItems.equals("Pants")){
            System.out.println(" 1. Ripped Jeans - 150 \n 2. Baggy Jeans - 180 \n 3. Denim Pants - 220 \n 4. Cargo Pants - 120");
        } else if (searchItems.equals("Dress")){
            System.out.println(" 1. Fitted Dress - 100 \n 2. Cocktail Dress - 200 \n 3. Infinity Dress - 270");
        } else if (searchItems.equals("Shirts")){
            System.out.println(" 1. Polo Shirts - 120 \n 2. Oversize Shirts - 180 \n 3. Half sleeve T-Shirts - 110 \n 4. Round Neck T-shirts - 150 \n 5. V-neck Shirts - 180");
        } else if (searchItems.equals("Shoes And Sandals")){
            System.out.println(" 1. Men's Shoes - 325 \n 2. Women's Shoes - 300 \n 3. Men's Sandals - 180 \n 4. Women's Sandals - 200");
        }
    }

    public void viewItem(){

    }

    public void addToCart(){

    }

    public void viewCart(){

    }

}
